package com.example.inventory_presentation.cookie_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.inventory_domain.use_cases.InventoryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CookieScreenViewModel @Inject constructor(
    private val useCases: InventoryUseCases
): ViewModel() {

    var state by mutableStateOf(CookieScreenState())

    fun updateCookie(name: String) = viewModelScope.launch {
        state = state.copy(
            cookie = useCases.getCookieByName(name)
        )
    }
}