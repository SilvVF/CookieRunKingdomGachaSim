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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core.util.UiEvent
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.R
import com.example.gacha_presentation.components.CookieBoxTopBar
import com.example.gacha_presentation.components.DualColorButton
import com.example.gacha_presentation.components.GachaHistoryText
import com.example.gacha_presentation.components.PulledCookieBox
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
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
    val currentAlert = remember {
        mutableStateOf(10)
    }

    LaunchedEffect(key1 = true ){
        viewModel.uiEvent.collect {
            when (it) {
                is UiEvent.ShowAlertDialog -> {
                    currentAlert.value = it.id
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
            if (alertDialogState) {
                AlertDialog(
                    onDismissRequest = { alertDialogState = false },
                    buttons = {
                        Image(
                            painter = painterResource(id = currentAlert.value),
                            contentDescription = null
                        )
                    },
                    properties = DialogProperties(
                        dismissOnClickOutside = true
                    ),
                    modifier = Modifier.size(300.dp, 300.dp).align(CenterHorizontally)
                )
            }
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
            Button(
                onClick = {
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
                },
                modifier = Modifier
                    .size(width = 120.dp, height = 60.dp),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = com.example.core.R.drawable.crystal_icon),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(spacing.spaceMedium))
                    Text(
                        text = stringResource(id = R.string.draw_10),
                        style = MaterialTheme.typography.button,
                        color = Color.White
                    )
                }
            }
        }
    }
}

