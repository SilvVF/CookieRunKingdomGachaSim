package com.example.gacha_presentation.gacha_screen

import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.R
import com.example.gacha_presentation.components.*
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalDateTime

@Composable
fun GachaScreen(
    onNavigateToInventory: () -> Unit,
    onNavigateToCookie: (String) -> Unit,
    viewModel: GachaScreenViewModel = hiltViewModel()
) {
    val state = viewModel.state
    val spacing = LocalSpacing.current
    // Remember a CoroutineScope to be able to launch
    val coroutineScope = rememberCoroutineScope()
    if (state.shouldDisplayPopup) {
        val popups = remember {
            mutableStateOf(state.currentCookiePopups.iterator())
        }
        var currPopup by remember {
            mutableStateOf(popups.value.next().toPair())
        }
        if (currPopup.first.isNotEmpty())
            CookiePopup(
                imageId = currPopup.second,
                cookieName = currPopup.first,
                onDismiss = {
                    if (popups.value.hasNext())  try {
                        currPopup = popups.value.next().toPair()
                    } catch (e: Exception) {
                        viewModel.onEvent(GachaScreenEvent.OnDismissPopupScreen)
                    }
                    else viewModel.onEvent(GachaScreenEvent.OnDismissPopupScreen)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .clip(RoundedCornerShape(12.dp))
                    .border(
                        BorderStroke(
                            width = 2.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color.Magenta,
                                    Color.Cyan,
                                )
                            )
                        ),
                        shape = RoundedCornerShape(12.dp)
                    )
            )
    }
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
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row {
                Button(
                    onClick = { onNavigateToInventory() },
                    modifier = Modifier
                        .padding(spacing.spaceMedium)
                        .weight(1f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFC904))
                ) {
                    Text(
                        text = stringResource(id = R.string.inventory),
                        color = Color.White
                    )
                }
                Button(
                    onClick = { viewModel.onEvent(GachaScreenEvent.OnClearInventoryClick) },
                    modifier = Modifier
                        .padding(spacing.spaceMedium)
                        .weight(1f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF4D4F))
                ) {
                    Text(
                        text = stringResource(id = R.string.reset),
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(spacing.spaceLarge))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(
                        Color.LightGray.copy(
                            alpha = 0.5f
                        )
                    )
            ) {
                GachaHistoryText(
                    text = stringResource(id = R.string.gacha_history),
                    modifier = Modifier.align(CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(spacing.spaceMedium))
                LazyRow(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(16.dp),
                    reverseLayout = false,
                    state = state.listState
                ) {
                    items(state.pulledCookies) {
                        Column {
                            CookieBoxTopBar(
                                modifier = Modifier
                                    .width(350.dp),
                                time = LocalDateTime.now(),
                                date = LocalDate.now()
                            )
                            PulledCookieBox(
                                cookiesPulled = it,
                                onCookieClick = {
                                    onNavigateToCookie(it)
                                },
                                modifier = Modifier
                                    .height(175.dp)
                                    .padding(end = spacing.spaceLarge)
                            )
                        }
                    }
                }
                TotalCrystalBox(
                    total = state.totalCrystals,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(spacing.spaceSmall)
                        .align(CenterHorizontally)
                )
            }
            Spacer(modifier = Modifier.height(spacing.spaceExtraLarge))
            GachaDrawButton(
                modifier = Modifier
                    .size(height = 70.dp, width = 180.dp)
                    .clip(RoundedCornerShape(12.dp)),
                textSize = 20,
                textColor = Color.White
            ) {
                if (state.shouldDisplayPopup) viewModel.onEvent(GachaScreenEvent.OnDismissPopupScreen)
                viewModel.onEvent(GachaScreenEvent.OnDrawTenButtonClick)
                coroutineScope.launch {
                    state.listState.animateScrollToItem(
                        index = 0,
                        scrollOffset = 0
                    )
                    state.listState.animateScrollBy(
                        value = state.listState.firstVisibleItemScrollOffset.toFloat(),
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessLow,
                            visibilityThreshold = null
                        )
                    )
                }
            }
        }
    }
}


