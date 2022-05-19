package com.example.gacha_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gacha_presentation.R
import com.example.gacha_presentation.R.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@Composable
fun CookieBoxTopBar(
    modifier: Modifier = Modifier,
    date: LocalDate = LocalDate.now(),
    time: LocalDateTime = LocalDateTime.now(),
) {
    Column(
        modifier = modifier
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Row() {
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
        Box(
            Modifier
                .padding(5.dp)
                .clip(RoundedCornerShape(10.dp))
        ) {
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = CenterVertically,
                modifier = Modifier
                    .padding()
                    .background(Color.Gray)
            ){
                Image(
                    modifier = Modifier
                        .padding(end = 3.dp),
                    painter = painterResource(id = com.example.core.R.drawable.icon_clock),
                    contentDescription = null
                )
                Text(
                    text = date.format(DateTimeFormatter.ISO_LOCAL_DATE)
                )
                Text(
                    text = time.hour.toString()
                )
            }
        }

    }
}



