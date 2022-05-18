package com.example.gacha_presentation.gacha_screen



import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.components.PulledCookieBox
import java.time.LocalDate
import java.time.LocalDateTime

@Composable
fun GachaScreen(
    onNavigateToInventory:(id: Int) -> Unit,
    viewModel: GachaScreenViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    val state  = viewModel.state
    val spacing = LocalSpacing.current
    val scrollState = rememberScrollState()
    Log.d("tttt", state.pulledCookies.toString())
        LazyRow(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .clickable {
                    viewModel.onEvent(GachaScreenEvent.OnDrawTenButtonClick)
                }
                .padding(16.dp)
        ) {
            state.pulledCookies.forEach {
                item {
                    PulledCookieBox(
                        cookiesPulled = it,
                        onCookieClick = {
                                        it
                        },
                        time = LocalDateTime.now(),
                        date = LocalDate.now())
                }
            }
        }
    }

