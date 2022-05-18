package com.example.gacha_presentation.gacha_screen



import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.components.PulledCookieBox
import kotlinx.coroutines.launch
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
    val listState = rememberLazyListState()
    // Remember a CoroutineScope to be able to launch
    val coroutineScope = rememberCoroutineScope()
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.LightGray),
        ) {
            Text(
                text = "Cookie Gacha History",
                style = TextStyle.Default,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.Start)
            )
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
            LazyRow(
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
                    .clickable {
                        viewModel.onEvent(GachaScreenEvent.OnDrawTenButtonClick)
                        coroutineScope.launch {
                            listState.animateScrollBy(
                                value = listState.layoutInfo.viewportEndOffset.toFloat(),
                                animationSpec = tween(
                                        durationMillis = 300,
                                        easing = FastOutLinearInEasing
                                    )
                                )
                        }
                    }
                    .padding(16.dp),
                reverseLayout = true,
                state = listState
            ) {
                items(state.pulledCookies) {
                    PulledCookieBox(
                        cookiesPulled = it,
                        onCookieClick = {
                            it
                        },
                        time = LocalDateTime.now(),
                        date = LocalDate.now(),
                        modifier = Modifier.height(200.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }

        }
    }
}

