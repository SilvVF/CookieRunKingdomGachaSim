package com.example.core_ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val default: Dp = 0.dp,
    val spaceExtraSmall: Dp = 4.dp,
    val spaceSmall: Dp = 8.dp,
    val spaceMedium: Dp = 16.dp,
    val spaceLarge: Dp = 32.dp,
    val spaceExtraLarge: Dp = 64.dp
)

//SEE APP THEME.KT TO SEE HOW TO PASS THEM TO THE PROJECT
//THE VAL LOCAL SPACING IS USED TO PASS OUR DIMENSIONS DATA CLASS

//compositionLocalOf allows the passing of values down the composable tree without
//the need to specify them as a parameter or inject them using DI

//provide it with the class/data we want to pass down the composable tree
val LocalSpacing = compositionLocalOf { Dimensions() }