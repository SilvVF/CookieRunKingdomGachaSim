package com.example.gacha_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorModel
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.LocalSpacing
import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.models.Rarity
import java.time.LocalDate
import java.time.LocalDateTime

@Composable
fun PulledCookieBox(
    cookiesPulled: List<GachaCookie>,
    onCookieClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    Box (
        modifier = modifier
            .clip(
                RoundedCornerShape(
                    bottomEnd = 5.dp,
                    bottomStart = 5.dp
                )
            )
            .shadow(
                elevation = 2.dp,
                shape = RoundedCornerShape(
                    bottomEnd = 5.dp,
                    bottomStart = 5.dp
                )
            )
            .background(Color(0xFFF2E9E0))
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(350.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                for (i in 0 until (cookiesPulled.size / 2)) {
                    val cookie = cookiesPulled[i]
                    if (cookie.isFullCookie) {
                        CookieItemBox(
                            imageId = cookie.cookieGachaImage,
                        ){
                            onCookieClick(cookie.name)
                        }
                    } else {
                        SoulstoneItemBox(
                            imageId = cookie.soulStoneImage,
                            count = cookie.soulStoneCount
                        ){
                            onCookieClick(cookie.name)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                for (i in (cookiesPulled.size / 2)..cookiesPulled.lastIndex ) {
                    val cookie = cookiesPulled[i]
                    if (cookie.isFullCookie) {
                        CookieItemBox(
                            imageId = cookie.cookieGachaImage,
                        ){
                            onCookieClick(cookie.name)
                        }
                    } else {
                        SoulstoneItemBox(
                            imageId = cookie.soulStoneImage,
                            count = cookie.soulStoneCount
                        ){
                            onCookieClick(cookie.name)
                        }
                    }
                }
            }
        }

    }

}