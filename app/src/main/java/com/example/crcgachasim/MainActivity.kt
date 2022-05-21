package com.example.crcgachasim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.TextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.crcgachasim.navigation.Route
import com.example.crcgachasim.ui.theme.CRCGachaSimTheme
import com.example.gacha_presentation.gacha_screen.GachaScreen
import com.example.inventory_presentation.inventory_screen.InventoryScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CRCGachaSimTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    NavHost(navController = navController, startDestination = Route.GACHA){
                        composable(route = Route.GACHA) {
                            GachaScreen(onNavigateToInventory = {
                                navController.navigate(Route.INVENTORY)
                            })
                        }
                        composable(route = Route.INVENTORY) {
                            InventoryScreen()
                        }
                        composable(route = Route.COOKIE_DETAIL) {

                        }
                    }
                }
            }
        }
    }
}

