package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.LocalSpacing
import com.example.inventory_domain.models.InfoCookie
import com.example.inventory_domain.models.Position

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
                .fillMaxWidth()
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
        Spacer(modifier = Modifier.height(2.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }

}


@Composable
fun CookieDetailItem(
    category: String,
    modifier: Modifier = Modifier,
    description: String,
    icon: Int? = null
) {
    Row (
      modifier = modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.25f)
                .background(Color.Magenta)
        ) {

        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.75f)
        ){

        }
    }
}