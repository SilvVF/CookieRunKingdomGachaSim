package com.example.inventory_presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.R

@Composable
fun CookieItemBottomBar(
    modifier: Modifier = Modifier,
    soulstoneCount: Float,
    soulStoneMax: Float,
    soulStoneImageId: Int,
    fontSize: Int,
) {
    val percentageFilled by remember {
        mutableStateOf(soulstoneCount / soulStoneMax)
    }
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
            .background(Color.DarkGray)
            .height(32.dp)
            .padding(start = 4.dp, end = 4.dp, top = 2.dp, bottom = 2.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        if (soulstoneCount > soulStoneMax) {
            Text(
                text = stringResource(id = R.string.highest_grade),
                fontSize = fontSize.sp,
                style = MaterialTheme.typography.h3,
                color = Color.Yellow,
                fontWeight = FontWeight.ExtraBold,
            )
        } else {
            Box(modifier = Modifier){
                Canvas(
                    modifier = Modifier.fillMaxSize().padding(5.dp)
                )
                {
                    drawRoundRect(
                        size = size,
                        color = Color(0xff1C1C1E),
                        cornerRadius = CornerRadius(x = 30f, y = 30f)
                    )
                    drawRoundRect(
                        size = size.copy(
                            width = size.width * if (percentageFilled < 1) percentageFilled else 1f
                        ),
                        color = Color(0xffFFD401),
                        cornerRadius = CornerRadius(x = 30f, y = 30f)
                    )
                }
                Image(
                    painter = painterResource(id = soulStoneImageId),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(x = (-2).dp, y = (-2).dp)
                )
                Text(
                    text = "${soulstoneCount.toInt()} / ${soulStoneMax.toInt()}",
                    fontSize = fontSize.sp,
                    style = MaterialTheme.typography.h3,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
    
            }
        }
    }
}