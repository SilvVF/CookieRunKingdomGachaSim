package com.example.gacha_presentation.gacha_screen

import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.core.util.UiEvent
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.R
import com.example.gacha_presentation.components.*
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalDateTime

@Composable
fun GachaScreen(
    onNavigateToInventory:() -> Unit,
    viewModel: GachaScreenViewModel = hiltViewModel()
) {
    val state  = viewModel.state
    val spacing = LocalSpacing.current
    val listState = rememberLazyListState()
    // Remember a CoroutineScope to be able to launch
    val coroutineScope = rememberCoroutineScope()
    var alertDialogState  by remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current
    var currAlertIndex by remember { mutableStateOf(0) }
    var currentAlert by remember {
        mutableStateOf(
            listOf<Int>()
        )
    }

    if (alertDialogState) {
            AlertDialog(
                onDismissRequest = {
                    if (currentAlert.getOrNull(currAlertIndex  + 1) == null){
                        alertDialogState = false
                        currAlertIndex = 0
                    }
                    currAlertIndex += 1
                },
                buttons = {
                    if (currentAlert.getOrNull(currAlertIndex) == null) return@AlertDialog
                         Image(
                             painter = painterResource(id = currentAlert[currAlertIndex]),
                             contentDescription = null,
                             modifier = Modifier.fillMaxSize(),
                             contentScale = ContentScale.FillBounds
                         )
                },
                properties = DialogProperties(
                    dismissOnClickOutside = true
                ),
                modifier = Modifier.size(300.dp, 300.dp)
            )
    }

    LaunchedEffect(key1 = true ){
        viewModel.uiEvent.collect {
            when (it) {
                is UiEvent.ShowAlertDialog -> {
                    currentAlert = it.id
                    alertDialogState = true
                }
                else ->{}
            }
        }
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
            Row() {
                Button(
                    onClick = { onNavigateToInventory() },
                    modifier = Modifier
                        .padding(spacing.spaceMedium)
                        .weight(1f)
                ) {
                    Text(
                        text = stringResource(id = R.string.inventory)
                    )
                }
                Button(
                    onClick = { viewModel.onEvent(GachaScreenEvent.OnClearInventoryClick) },
                    modifier = Modifier
                        .padding(spacing.spaceMedium)
                        .weight(1f)
                ) {
                    Text(
                        text = stringResource(id = R.string.reset)
                    )
                }
            }
            Spacer(modifier = Modifier.height(spacing.spaceLarge))
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
                    reverseLayout = false,
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

                                },
                                time = LocalDateTime.now(),
                                date = LocalDate.now(),
                                modifier = Modifier
                                    .height(175.dp)
                                    .padding(end = spacing.spaceLarge)
                            )
                        }
                    }
                }
            }
            Spacer(modifier =  Modifier.height(spacing.spaceExtraLarge))
            Text(
                text = "Total Crystals Spent \n" +
                        "${state.totalCrystals}",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
            )
            GachaDrawButton(
                modifier = Modifier
            ) {
                viewModel.onEvent(GachaScreenEvent.OnDrawTenButtonClick)
                coroutineScope.launch {
                    listState.animateScrollToItem(
                        index = 0,
                        scrollOffset = 0
                    )
                    listState.animateScrollBy(
                        value = listState.firstVisibleItemScrollOffset.toFloat(),
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

