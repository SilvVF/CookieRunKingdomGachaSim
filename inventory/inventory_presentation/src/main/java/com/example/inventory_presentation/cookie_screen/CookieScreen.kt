package com.example.inventory_presentation.cookie_screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CookieScreen(
    cookieName: String,
    viewModel: CookieScreenViewModel = hiltViewModel()
) {

    LaunchedEffect(key1 = true){
        Log.d("NAME_IN_COOKIE_SCREEN", cookieName)
        viewModel.updateCookie(cookieName)
    }
   val cookie = viewModel.state.cookie ?: return
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(cookie.cookieInventoryImage),
            contentDescription = cookie.name
        )
        CookieRarityTag(
            rarity =  cookie.rarity
        )
    }
}