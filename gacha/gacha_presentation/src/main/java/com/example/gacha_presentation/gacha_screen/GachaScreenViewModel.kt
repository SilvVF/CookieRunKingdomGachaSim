package com.example.gacha_presentation.gacha_screen



import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
    private val gachaUseCases: GachaUseCases
): ViewModel() {
    var state by mutableStateOf(GachaScreenState())
        private set

    private var pull: Job? = null

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()


    init {
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
                           pulledCookies = refreshCookieList()
                       )
                   }
                }
            }
            is GachaScreenEvent.OnToggleCookieClick -> {

            }
            is GachaScreenEvent.OnToggleTreasureClick -> {

            }
            is GachaScreenEvent.OnClearInventoryClick -> {
                viewModelScope.launch(Dispatchers.IO) {
                    gachaUseCases.deleteInventory()
                }
            }
        }
    }
    private suspend fun refreshCookieList(): List<List<GachaCookie>> {
        val imageIdList = mutableListOf<Int>()
        val res = mutableListOf(gachaUseCases.performCookieGacha().onEach { cookie  ->
            if (cookie.isFullCookie &&
                cookie.rarity == Rarity.Epic ||
                cookie.rarity == Rarity.Ancient ||
                cookie.rarity == Rarity.SuperEpic ||
                cookie.rarity == Rarity.Legendary
            ) {
                imageIdList.add(cookie.cookieImageAnimated)
            }
        })
        if (imageIdList.isNotEmpty()) _uiEvent.send(UiEvent.ShowAlertDialog(imageIdList))
        res.addAll(state.pulledCookies)

        return gachaUseCases.filterCookieList(res)
    }
}



