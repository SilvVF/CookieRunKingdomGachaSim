package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inventory_domain.models.Position
import com.example.inventory_domain.models.Type
import com.example.inventory_presentation.R

@Composable
fun CookiePositionAndTypeBox(
    modifier: Modifier = Modifier,
    position: Position,
    type: Type,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        ItemBox(
            icon = when (position) {
                    is Position.BACK -> com.example.core.R.drawable.postition_back_icon
                    is Position.FRONT -> com.example.core.R.drawable.position_front_icon
                    is Position.MIDDLE -> com.example.core.R.drawable.position_middle_icon
            },
            tag = stringResource(id = com.example.core.R.string.position),
            iconTag = position.position,
            modifier = Modifier.weight(1f)
        )
        ItemBox(
            icon = when (type) {
                is Type.Ambush -> com.example.core.R.drawable.ambush_icon
                is Type.Support -> com.example.core.R.drawable.support_icon
                is Type.Bomber -> com.example.core.R.drawable.bomber_icon
                is Type.Magic -> com.example.core.R.drawable.magic_icon
                is Type.Defense -> com.example.core.R.drawable.def_icon
                is Type.Charge -> com.example.core.R.drawable.charge_icon
                is Type.Healing -> com.example.core.R.drawable.heal_icon
                is Type.Ranged -> com.example.core.R.drawable.ranged_icon
            },
            tag = stringResource(id = com.example.core.R.string.type),
            iconTag = type.type,
            modifier = Modifier.weight(1f)
        )
    }

}

@Composable
fun ItemBox(
    modifier: Modifier = Modifier,
    icon: Int,
    tag: String,
    iconTag: String
) {
    Box(
        modifier = modifier.border(
            width = 1.dp,
            color = Color.Black,
        )
    ) {
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = tag,
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
            )
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            ){
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    Modifier.size(32.dp, 32.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = iconTag,
                    fontSize = 18.sp,
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Normal,
                )
            }
        }
    }
}