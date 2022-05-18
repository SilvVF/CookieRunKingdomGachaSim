package com.example.gacha_presentation.gacha_screen

import android.graphics.DiscretePathEffect
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.util.UiEvent
import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.repository.use_cases.DetermineShouldPopulateDb
import com.example.gacha_domain.repository.use_cases.GachaUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
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
                performCookieGacha()
            }
            is GachaScreenEvent.OnToggleCookieClick -> {

            }
            is GachaScreenEvent.OnToggleTreasureClick -> {

            }
            else -> {}
        }
    }

    private fun performCookieGacha() = viewModelScope.launch {

        state = state.copy(
            pulledCookies = state.pulledCookies.apply {
                  add(gachaUseCases.performCookieGacha())
            },
            totalCrystals = state.totalCrystals + 3000
        )
    }

}