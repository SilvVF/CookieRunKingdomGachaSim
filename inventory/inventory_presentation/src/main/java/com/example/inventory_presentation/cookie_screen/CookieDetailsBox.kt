package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.R
import com.example.core_ui.LocalSpacing
import com.example.inventory_domain.models.InfoCookie

@Composable
fun CookieDetailsBox(
    cookie: InfoCookie,
    modifier: Modifier = Modifier,
    textSize: Int
) {
    val spacing = LocalSpacing.current
    Column(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topEnd = 18.dp, topStart = 18.dp))
                .background(Color(0xFF604F41)),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = cookie.headIcon),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(spacing.spaceMedium))
            Text(
                text = cookie.name,
                color = Color.White,
                fontSize = textSize.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        CookieSkillItem(
            skillName = cookie.skill,
            skillDescription = cookie.skillDesc,
            icon = cookie.skillIcon,
            skillStats = cookie.skillStats,
            cooldown = cookie.skillCooldown,
            gameDescription = cookie.gameDescription
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
                .clip(RoundedCornerShape(bottomEnd = 18.dp, bottomStart = 18.dp))
                .background(Color(0xFF604F41)),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){

        }
    }

}


