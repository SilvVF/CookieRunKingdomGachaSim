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
            cooldown = cookie.skillCooldown
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


@Composable
fun CookieSkillItem(
    skillName: String,
    modifier: Modifier = Modifier,
    skillDescription: String,
    icon: Int,
    skillStats: String,
    cooldown: Int
) {
    Column (
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(
                width = 3.dp,
                color = Color.Black
            )
            .background(Color.DarkGray)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth().wrapContentHeight()
        ) {
            CookieCooldownBar(
                cooldown = cooldown,
                modifier = Modifier.wrapContentHeight()
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier.padding(2.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = "Skill",
                    textAlign = TextAlign.Start,
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 2.dp)
                )
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp, 100.dp)
                        .padding(start = 2.dp),
                    contentScale = ContentScale.Fit
                )
            }
            Column(
                modifier = Modifier
                    .weight(0.7f)
                    .fillMaxHeight()
                    .padding(3.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = skillName,
                    fontStyle = FontStyle.Italic,
                    color = Color.White,
                    modifier = Modifier.padding(start = 2.dp)
                )
                Text(
                    text = skillDescription,
                    style = MaterialTheme.typography.h3,
                    fontSize = 16.sp,
                    color = Color.White,
                    modifier = Modifier.padding(start = 2.dp)
                )
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .height(2.dp)
                .border(BorderStroke(width = 2.dp, Color.Black))){}
        Spacer(modifier = Modifier.height(1.dp))
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .padding(3.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.skill_stats),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(start = 2.dp)
            )
            Text(
                text = skillStats,
                style = MaterialTheme.typography.h3,
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 2.dp)
            )
        }
    }
}