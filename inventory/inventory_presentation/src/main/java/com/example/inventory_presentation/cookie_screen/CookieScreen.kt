package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.inventory_presentation.components.CookieInfoBlock
import com.example.inventory_presentation.components.CookieInfoImageBox

@Composable
fun CookieScreen(
    cookieName: String,
    viewModel: CookieScreenViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    LaunchedEffect(key1 = true){
        viewModel.updateCookie(cookieName)
    }
   val state = viewModel.state
    Column(
        Modifier.scrollable(
            state = state.scrollState,
            enabled = true,
            orientation = Orientation.Vertical
        )
    ){
        CookieInfoImageBox(
            cookie = state.cookie
        )
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        CookieDetailsBox(
            state.cookie,
            Modifier.fillMaxSize(),
            32
        )
    }
}