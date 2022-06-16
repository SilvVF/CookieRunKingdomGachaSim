package com.example.inventory_presentation.cookie_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.inventory_domain.models.InfoCookie
import com.example.inventory_domain.models.Position
import com.example.inventory_domain.models.Rarity
import com.example.inventory_domain.models.Type
import com.example.inventory_domain.use_cases.InventoryUseCases
import com.example.inventory_presentation.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CookieScreenViewModel @Inject constructor(
    private val useCases: InventoryUseCases
): ViewModel() {

    private val defaultCookie = InfoCookie(
        "",
        com.example.core.R.drawable.cookie_cutter,
        com.example.core.R.drawable.cookie_cutter,
        Type.Ambush,
        Rarity.Rare,
        Position.BACK,
        "",
        "",
        "",
        com.example.core.R.drawable.cookie_cutter,
        "",
        "",
        0
    )
    var state by mutableStateOf(CookieScreenState(defaultCookie))

    fun updateCookie(name: String) = viewModelScope.launch {
            state = state.copy(
                cookie = useCases.getCookieByName(name)
            )
    }
}