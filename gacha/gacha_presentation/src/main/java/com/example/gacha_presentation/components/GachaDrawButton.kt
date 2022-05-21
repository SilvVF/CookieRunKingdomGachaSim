package com.example.gacha_presentation.components

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core.R
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.gacha_screen.GachaScreenEvent
import kotlinx.coroutines.launch

@Composable
fun GachaDrawButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    val spacing = LocalSpacing.current
    Button(
        onClick = {
            onClick()
        },
        modifier = Modifier
            .size(width = 120.dp, height = 60.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.crystal_icon),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(spacing.spaceMedium))
            Text(
                text = stringResource(id = com.example.gacha_presentation.R.string.draw_10),
                style = MaterialTheme.typography.button,
                color = Color.White
            )
        }
    }
}