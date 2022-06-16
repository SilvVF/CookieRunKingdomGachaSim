package com.example.inventory_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.R
import com.example.inventory_domain.models.InfoCookie
import com.example.inventory_presentation.cookie_screen.CookieRarityTag

@Composable
fun CookieInfoImageBox(
    modifier: Modifier = Modifier,
    cookie: InfoCookie,
) {
    Box(
        modifier = modifier.background(Color(0xFFE189FC))
    ) {
        Image(
            painter = painterResource(id = R.drawable.cookie_info_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    text =  "“",
                    fontSize = 42.sp,
                    color = Color(0xffB86725),
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .align(Alignment.Top)
                )
                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxWidth(0.6f)
                ){
                    Text(
                        text = cookie.quote,
                        fontSize = 24.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center
                    )
                }
                Text(
                    text =  "„",
                    fontSize = 42.sp,
                    color = Color(0xffB86725),
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .align(Alignment.Bottom)
                )
            }
            Image(
                painter = painterResource(cookie.cookieFullArt),
                contentDescription = cookie.name,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .height(300.dp)
            )
            CookieRarityTag(
                rarity = cookie.rarity,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
            )
        }
    }
}