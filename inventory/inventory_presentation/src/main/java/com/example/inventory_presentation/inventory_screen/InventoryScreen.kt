package com.example.inventory_presentation.inventory_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core_ui.LocalSpacing
import com.example.inventory_presentation.components.CookieRow
import com.example.inventory_presentation.components.InventoryCookieItem
import com.example.inventory_presentation.inventory_screen.inventory_models.InventoryScreenEvent

@Composable
fun InventoryScreen(
    viewModel: InventoryViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    LaunchedEffect(key1 = true){viewModel.refreshList()}
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Text(text = stringResource(id = com.example.core.R.string.my_cookies))
        }
        items(state.cookieList.size / 2) {
            CookieRow(
                cookies = listOf(
                    state.cookieList[it * 2],
                    state.cookieList[it * 2  + 1]
                ),
            )
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
        }
    }

}