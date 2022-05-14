package com.example.crcgachasim.navigation

import androidx.navigation.NavController
import com.example.core.util.UiEvent

//allows the callback from ui screens to be able to navigate to the next composable
//from the outside
fun NavController.navigate(event: UiEvent.Success){
    this.navigate(event)
}