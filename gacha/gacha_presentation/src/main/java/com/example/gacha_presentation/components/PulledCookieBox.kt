package com.example.gacha_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.core_ui.LocalSpacing
import com.example.gacha_domain.models.GachaCookie
import java.time.LocalDate
import java.time.LocalDateTime

@Composable
fun PulledCookieBox(
    cookiesPulled: List<GachaCookie>,
    onCookieClick: (id: Int) -> Unit,
    time: LocalDateTime,
    date: LocalDate,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    Column (
        modifier = modifier
    ){
        CookieBoxTopBar(
            time = time,
            date = date
        )
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        Row (
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){
            cookiesPulled.forEach {
                if (it.isFullCookie) {
                    Image(
                        painter = painterResource(id = it.cookieGachaImage),
                        contentDescription = null
                    )

                } else {
                    Image(
                        painter = painterResource(id = it.soulStoneImage),
                        contentDescription = null
                    )
                }
            }
        }
    }
    
}