package com.example.inventory_presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.inventory_domain.models.InventoryCookie

@Composable
fun InventoryCookieItem(
    modifier: Modifier = Modifier,
    cookie: InventoryCookie,
    onCookieClick: (Int) -> Unit
){
   Box(modifier = modifier
       .clip(RoundedCornerShape(20.dp))
       .wrapContentSize()
       .border(
           border = BorderStroke(4.dp, Color.Black),
           shape = RoundedCornerShape(20.dp)
       )
   ) {
       Image(
           painter = painterResource(id = cookie.cookieInventoryImage),
           contentDescription = null,
           modifier = Modifier
               .height(120.dp)
               .width(120.dp)
               .offset(x = 0.dp, y= (-2).dp)
               .fillMaxSize(),
           contentScale = ContentScale.Fit
       )
       CookieItemBottomBar(
           modifier = Modifier
               .width(120.dp)
               .align(Alignment.BottomCenter),
           soulstoneCount = cookie.soulStoneCount.toFloat(),
           soulStoneMax = cookie.soulStoneMax.toFloat(),
           soulStoneImageId = cookie.soulStoneImage,
           fontSize = 14
       )
   }
}