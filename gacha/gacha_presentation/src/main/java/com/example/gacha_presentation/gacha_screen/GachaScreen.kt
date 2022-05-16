package com.example.gacha_presentation.gacha_screen


import android.util.Log
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.D
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.components.PulledCookieBox
import kotlinx.coroutines.flow.collect

@Composable
fun GachaScreen(
    onNavigateToInventory:(id: Int) -> Unit,
    viewModel: GachaScreenViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    val state  = viewModel.state
    val spacing = LocalSpacing.current
    val scrollState = rememberScrollState()
    LaunchedEffect(key1 = true){
        viewModel.onEvent(GachaScreenEvent.OnDrawTenButtonClick)
    }
    Column() {
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(state.pulledCookies) { pulledCookieList ->

                PulledCookieBox(
                    cookiesPulled = pulledCookieList,
                    onCookieClick = { id ->
                        onNavigateToInventory(id)
                    },
                    time = state.time,
                    date = state.date,
                    modifier = Modifier
                )
            }
        }
    }

}