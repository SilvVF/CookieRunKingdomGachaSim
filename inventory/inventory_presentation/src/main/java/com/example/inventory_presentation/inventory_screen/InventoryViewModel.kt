package com.example.inventory_presentation.inventory_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.use_cases.InventoryUseCases
import com.example.inventory_presentation.inventory_screen.inventory_models.InventoryScreenEvent
import com.example.inventory_presentation.inventory_screen.inventory_models.InventoryState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InventoryViewModel @Inject constructor(
    private val inventoryUseCases: InventoryUseCases
): ViewModel() {

    var state by mutableStateOf(InventoryState())

    init {
        viewModelScope.launch {
            state = state.copy(
                cookieList = inventoryUseCases.getAllCookiesFromDb()
            )
        }
    }


    fun refreshList() = viewModelScope.launch {
            state = state.copy(
                cookieList = inventoryUseCases.getAllCookiesFromDb()
            )
    }
}

