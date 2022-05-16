package com.example.gacha_presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Box (modifier){
        Text(text = cookiesPulled[0].toString())
    }
    
}