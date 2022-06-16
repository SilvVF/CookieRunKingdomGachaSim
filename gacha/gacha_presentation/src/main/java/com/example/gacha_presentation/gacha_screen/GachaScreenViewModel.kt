package com.example.gacha_presentation.gacha_screen



import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.data.preferences.Preferences
import com.example.core.util.UiEvent
import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.models.Rarity
import com.example.gacha_domain.repository.use_cases.GachaUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class GachaScreenViewModel @Inject constructor(
    private val gachaUseCases: GachaUseCases,
    private val preferences: Preferences
): ViewModel() {
    var state by mutableStateOf(GachaScreenState())
        private set

    private var pull: Job? = null

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    val currentCookiePopup = mutableMapOf<String, Int>()

    init {
        state = state.copy(
            totalCrystals = preferences.getTotalCrystalsSpent()
        )
        viewModelScope.launch {
            gachaUseCases.determineShouldPopulateDb()
        }
    }

    fun onEvent(event: GachaScreenEvent) {
        when (event) {
            is GachaScreenEvent.OnCookieListButtonClick -> {

            }
            is GachaScreenEvent.OnDrawTenButtonClick -> {
                viewModelScope.launch(Dispatchers.Main) {
                   if (pull?.isActive == true) return@launch
                   pull = viewModelScope.launch(Dispatchers.IO) {
                       state = state.copy(
                           pulledCookies = refreshCookieList(),
                           shouldDisplayPopup = currentCookiePopup.isNotEmpty(),
                           currentCookiePopups = currentCookiePopup,
                           totalCrystals = state.totalCrystals + 3000
                       )
                       preferences.updateTotalCrystalsSpent(state.totalCrystals)
                   }
                }
            }
            is GachaScreenEvent.OnToggleCookieClick -> {

            }
            is GachaScreenEvent.OnToggleTreasureClick -> {

            }
            is GachaScreenEvent.OnClearInventoryClick -> {
                preferences.updateTotalCrystalsSpent(0)
                state = state.copy(
                    totalCrystals = 0
                )
                viewModelScope.launch(Dispatchers.IO) {
                    gachaUseCases.deleteInventory()
                }
            }
            is GachaScreenEvent.OnDismissPopupScreen ->  {
                state = state.copy(
                    shouldDisplayPopup = false
                )
            }
        }
    }
    private suspend fun refreshCookieList(): List<List<GachaCookie>> {
        currentCookiePopup.clear()
        val res = mutableListOf(gachaUseCases.performCookieGacha().onEach { cookie  ->
            if (cookie.isFullCookie &&
                (cookie.rarity == Rarity.Epic ||
                cookie.rarity == Rarity.Ancient ||
                cookie.rarity == Rarity.SuperEpic ||
                cookie.rarity == Rarity.Legendary)
            ) {
                currentCookiePopup[cookie.name] = cookie.cookieImageAnimated
            }
        })
        res.addAll(state.pulledCookies)
        return gachaUseCases.filterCookieList(res)

    }
}



