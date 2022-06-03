package com.example.inventory_presentation.inventory_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.inventory_presentation.R

@Composable
fun CookieStars(
    starCount: Int,
    modifier: Modifier = Modifier,
) {
    Row (
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        for (i in 0 until starCount) {
            Image(
                painter = painterResource(id = com.example.core.R.drawable.star_icon),
                contentDescription = "star_count",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(16.dp,16.dp)
            )
        }
    }
}