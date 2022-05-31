package com.example.gacha_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.LocalSpacing
import com.example.gacha_presentation.R.*
import java.time.LocalDate
import java.time.LocalDateTime


@Composable
fun CookieBoxTopBar(
    modifier: Modifier = Modifier,
    date: LocalDate,
    time: LocalDateTime,
) {
    val spacing = LocalSpacing.current
        Row(
            verticalAlignment = CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .background(Color.LightGray)
                .clip(
                    RoundedCornerShape(
                        topStart = 8.dp,
                        topEnd = 8.dp
                    )
                ),
        ) {
            Row(
                verticalAlignment = CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(start = spacing.spaceExtraSmall)
            ) {
                Image(
                    painter = painterResource(
                        id = com.example.core.R.drawable.cookie_cutter),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 24.dp, width = 24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(
                        id = string.result_draw_10
                    ),
                    textAlign = TextAlign.Start,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    style = MaterialTheme.typography.h1
                )
            }
            Row (
                verticalAlignment = CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color.DarkGray)
                    .wrapContentWidth()
            ) {
               Image(painter = painterResource(
                   id = com.example.core.R.drawable.icon_clock),
                   contentDescription = null
               )
               Text(
                   text = "${date.month.value}/${date.dayOfMonth}/${date.year.toString().removePrefix("20")} - ${time.hour} : ${time.minute} : ${time.second}",
                   color = Color.White,
                   modifier = Modifier.padding(4.dp)
               )
            }
        }
    }



