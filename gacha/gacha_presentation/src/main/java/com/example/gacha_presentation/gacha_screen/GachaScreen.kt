package com.example.gacha_presentation.gacha_screen



import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.R
import com.example.gacha_presentation.components.CookieBoxTopBar
import com.example.gacha_presentation.components.DualColorButton
import com.example.gacha_presentation.components.GachaHistoryText
import com.example.gacha_presentation.components.PulledCookieBox
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalDateTime

@Composable
fun GachaScreen(
    onNavigateToInventory:() -> Unit,
    viewModel: GachaScreenViewModel = hiltViewModel()
) {
    val context = LocalContext.current
    val state  = viewModel.state
    val spacing = LocalSpacing.current
    val listState = rememberLazyListState()
    // Remember a CoroutineScope to be able to launch
    val coroutineScope = rememberCoroutineScope()

    Box(
        Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = com.example.core.R.drawable.cookie_gacha_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .offset(
                    y = (-100).dp
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(375.dp)
                    .background(
                        Color.LightGray.copy(
                            alpha = 0.5f
                        )
                    )
            ) {
                GachaHistoryText(text = stringResource(id = R.string.gacha_history))
                Spacer(modifier = Modifier.height(spacing.spaceMedium))
                LazyRow(
                    modifier = Modifier
                        .height(350.dp)
                        .fillMaxWidth()
                        .padding(16.dp),
                    reverseLayout = true,
                    state = listState
                ) {
                    items(state.pulledCookies) {
                        Column {
                            CookieBoxTopBar(
                                modifier = Modifier
                                .width(350.dp)
                            )
                            PulledCookieBox(
                                cookiesPulled = it,
                                onCookieClick = {
                                    it
                                },
                                time = LocalDateTime.now(),
                                date = LocalDate.now(),
                                modifier = Modifier.height(175.dp).padding(end = spacing.spaceLarge)
                            )
                        }
                    }
                }
            }
            DualColorButton(
                textTop = stringResource(id = R.string.draw_10),
                textBottom = "3000",
                colorTop = Color(0xFFBF55F1),
                colorBottom = Color(0xFFA634EB),
                fontSize = 20,
                modifier = Modifier.width(200.dp),
                onClick = {
                    viewModel.onEvent(GachaScreenEvent.OnDrawTenButtonClick)
                    coroutineScope.launch {
                        listState.animateScrollToItem(
                            index = listState.layoutInfo.totalItemsCount,
                            scrollOffset = 100
                        )
                    }
                }
            )
        }
    }
}

