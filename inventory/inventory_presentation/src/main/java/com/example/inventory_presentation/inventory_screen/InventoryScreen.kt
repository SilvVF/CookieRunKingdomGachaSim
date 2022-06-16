package com.example.inventory_presentation.inventory_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.inventory_presentation.R
import com.example.inventory_presentation.components.CookieRow
import com.example.inventory_presentation.components.InventoryCookieItem
import com.example.inventory_presentation.inventory_screen.inventory_models.InventoryScreenEvent

@Composable
fun InventoryScreen(
    viewModel: InventoryViewModel = hiltViewModel(),
    onCookieSelected: (String) -> Unit,
    onNavigateToGacha: () -> Unit
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    LaunchedEffect(key1 = true){viewModel.refreshList()}
    Box (
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(com.example.core.R.drawable.cookie_info_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column {
            TopAppBar (backgroundColor = Color(0xFF604F41)){
                IconButton(
                    onClick = {
                        onNavigateToGacha()
                    },
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                Text(text = stringResource(id = com.example.core.R.string.gacha))
                Spacer(modifier = Modifier.width(25.dp))
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                items(state.cookieList.size / 3) {
                    CookieRow(
                        cookies = listOf(
                            state.cookieList[it * 3],
                            state.cookieList[it * 3 + 1],
                            state.cookieList[it * 3 + 2]
                        ),
                    ) { name ->
                        onCookieSelected(name)
                    }
                    Spacer(modifier = Modifier.height(spacing.spaceMedium))
                }
            }
        }
    }
}