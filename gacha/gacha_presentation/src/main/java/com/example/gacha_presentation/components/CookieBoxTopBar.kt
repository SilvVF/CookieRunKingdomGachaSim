package com.example.gacha_presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@Composable
fun CookieBoxTopBar(
    modifier: Modifier = Modifier,
    date: LocalDate = LocalDate.now(),
    time: LocalDateTime = LocalDateTime.now(),
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(20.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color.Yellow),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .background(MaterialTheme.colors.surface)) {
            Text(
                text = date.format(DateTimeFormatter.ISO_DATE).toString(),
                style = MaterialTheme.typography.h2,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .background(MaterialTheme.colors.surface)
        ) {
            Text(
                text = time.format(DateTimeFormatter.ISO_TIME).toString(),
                style = MaterialTheme.typography.h2,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


