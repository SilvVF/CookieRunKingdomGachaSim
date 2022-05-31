package com.example.gacha_presentation.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.R
import com.example.core_ui.LocalSpacing


@Composable
fun GachaDrawButton(
    modifier: Modifier = Modifier,
    textSize: Int,
    textColor: Color = Color.White,
    onClick: () -> Unit,
) {
    val spacing = LocalSpacing.current
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = modifier
        .border(
            BorderStroke(
                width = 1.dp, Color.Black,
            ),
            shape = RoundedCornerShape(12.dp)
        )
        .shadow(3.dp, RoundedCornerShape(12.dp))
        .clickable {
            onClick()
        }
    ) {
        Box(modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(Color(0xFFA634EB))
            .align(Alignment.BottomCenter)
        )
        Box(modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(Color(0xFFBF55F2))
            .align(Alignment.TopCenter)
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = stringResource(id = com.example.gacha_presentation.R.string.draw_10),
                color = textColor,
                fontSize = textSize.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(spacing.spaceMedium))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.crystal_icon),
                    contentDescription = null,
                    modifier = Modifier.offset(y = (0).dp).padding(end = 4.dp)
                )
                Text(
                    text = stringResource(id = com.example.gacha_presentation.R.string.draw_10_cost),
                    color = textColor,
                    fontSize = textSize.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}
