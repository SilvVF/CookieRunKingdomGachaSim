package com.example.gacha_presentation.gacha_screen



import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.util.UiEvent
import com.example.gacha_domain.models.GachaCookie
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
                viewModelScope.launch {
                    viewModelScope.launch {
                        state = state.copy(
                            pulledCookies = refreshCookieList()
                        )
                    }.join()
                }
            }
            is GachaScreenEvent.OnToggleCookieClick -> {

            }
            is GachaScreenEvent.OnToggleTreasureClick -> {

            }
            else -> {

            }
        }
    }
    suspend fun refreshCookieList(): List<List<GachaCookie>> {
        val res = mutableListOf(gachaUseCases.performCookieGacha())
        res.addAll(state.pulledCookies)
        return gachaUseCases.filterCookieList(res)
    }
}



