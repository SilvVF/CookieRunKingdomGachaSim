package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.inventory_presentation.R
import com.example.inventory_presentation.components.CookieInfoImageBox

@Composable
fun CookieScreen(
    cookieName: String,
    viewModel: CookieScreenViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val spacing = LocalSpacing.current
    LaunchedEffect(key1 = true){
        viewModel.updateCookie(cookieName)
    }
   val state = viewModel.state
    Column {
        TopAppBar(backgroundColor = Color(0xFF604F41)) {
            IconButton(
                onClick = {
                    onNavigateBack()
                },
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = Color.White
                )
            }
            Spacer(modifier = Modifier.width(25.dp))
        }
        LazyColumn(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xffD3C3B5))
        ) {
            item {
                CookieInfoImageBox(
                    cookie = state.cookie,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            item {
                CookiePositionAndTypeBox(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    position = state.cookie.position,
                    type = state.cookie.type
                )
                Spacer(modifier = Modifier.height(spacing.spaceMedium))
            }
            item {
                Box {
                    CookieDetailsBox(
                        cookie = state.cookie,
                        textSize = 32,
                        modifier = Modifier
                            .padding(8.dp)
                            .shadow(
                                1.dp,
                                RoundedCornerShape(
                                    18.dp
                                )
                            )
                            .padding(start = 3.dp, top = 3.dp, bottom = 3.dp, end = 1.dp)
                    )
                }
            }
        }
    }
}