package com.example.inventory_presentation.inventory_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
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
    onCookieSelected: (String) -> Unit
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    LaunchedEffect(key1 = true){viewModel.refreshList()}
    Box (
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(com.example.core.R.drawable.inventory_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Text(text = stringResource(id = com.example.core.R.string.my_cookies))
            }
            items(state.cookieList.size / 3) {
                CookieRow(
                    cookies = listOf(
                        state.cookieList[it * 3],
                        state.cookieList[it * 3  + 1],
                        state.cookieList[it * 3  + 2]
                    ),
                ){ name ->
                   onCookieSelected(name)
                }
                Spacer(modifier = Modifier.height(spacing.spaceMedium))
            }
        }
    }
}