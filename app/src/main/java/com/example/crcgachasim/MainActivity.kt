package com.example.crcgachasim

import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.TextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.crcgachasim.navigation.Route
import com.example.crcgachasim.ui.theme.CRCGachaSimTheme
import com.example.gacha_presentation.gacha_screen.GachaScreen
import com.example.inventory_presentation.cookie_screen.CookieScreen
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
                            GachaScreen(
                                onNavigateToInventory = {
                                    navController.navigate(Route.INVENTORY)
                                },
                                onNavigateToCookie = { cookieName ->
                                    navController.navigate(
                                        Route.COOKIE_DETAIL + "/$cookieName"
                                    )
                                }
                            )
                        }
                        composable(route = Route.INVENTORY) {
                            InventoryScreen (
                                onCookieSelected = { cookieName ->
                                    navController.navigate(
                                        Route.COOKIE_DETAIL + "/$cookieName"
                                    )
                                },
                                onNavigateToGacha = { navController.navigate(Route.GACHA) }
                            )
                        }
                        composable(
                            route = Route.COOKIE_DETAIL + "/{cookieName}",
                            arguments = listOf(
                                navArgument("cookieName"){
                                    type = NavType.StringType
                                    nullable = false
                                    defaultValue = "Kumiho Cookie"
                                }
                            )
                        ) { backStackEntry ->
                            backStackEntry
                                .arguments?.getString("cookieName")?.let { it ->
                                    CookieScreen(cookieName = it){
                                            navController.popBackStack()
                                    }
                                }
                        }
                    }
                }
            }
        }
    }
}

