package com.example.gacha_presentation.gacha_screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core.util.UiEvent

@Composable
fun GachaScreen(
    viewModel: GachaScreenViewModel = hiltViewModel()
) {

    val state  = viewModel.state

    Box(modifier = Modifier.fillMaxSize().clickable{

    }) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(state.pulledCookies){
                Column(
                    Modifier
                        .fillMaxWidth()
                        .height(30.dp)
                ) {
                    Text(text = it.toString())
                }
            }
        }
    }

}