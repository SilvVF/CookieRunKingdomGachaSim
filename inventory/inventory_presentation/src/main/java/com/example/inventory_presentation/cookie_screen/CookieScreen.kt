package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
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
    LazyColumn(
        Modifier.fillMaxSize()
    ) {
        item {
            CookieInfoImageBox(
                cookie = state.cookie,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
        }
        item {
            CookieDetailsBox(
                cookie = state.cookie,
                textSize = 32
            )
        }
    }
}