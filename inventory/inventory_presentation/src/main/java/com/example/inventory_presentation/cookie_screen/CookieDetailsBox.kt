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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        modifier = modifier.padding(spacing.spaceSmall)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFB755FF)),
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
        )
    }

}


@Composable
fun CookieSkillItem(
    skillName: String,
    modifier: Modifier = Modifier,
    skillDescription: String,
    icon: Int
) {
    Row (
      modifier = modifier
          .fillMaxWidth()
          .wrapContentHeight()
          .border(
              width = 3.dp,
              color = Color.Black
          )
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
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 2.dp)
            )
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp, 100.dp).padding(start = 2.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .weight(0.7f)
                .fillMaxHeight()
                .padding(3.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                ),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = skillName,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(start = 2.dp)
            )
            Text(
                text = skillDescription,
                style = MaterialTheme.typography.h3,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 2.dp)
            )
        }
    }
}