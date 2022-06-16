package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.R

@Composable
fun CookieSkillItem(
    skillName: String,
    modifier: Modifier = Modifier,
    skillDescription: String,
    icon: Int,
    skillStats: String,
    cooldown: Int,
    gameDescription: String
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
        Row(
            Modifier
                .fillMaxWidth()
                .height(2.dp)
                .border(BorderStroke(width = 2.dp, Color.Black))){}
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .padding(3.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.game_description),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(start = 2.dp)
            )
            Text(
                text = gameDescription,
                style = MaterialTheme.typography.h3,
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 2.dp)
            )
        }

    }
}