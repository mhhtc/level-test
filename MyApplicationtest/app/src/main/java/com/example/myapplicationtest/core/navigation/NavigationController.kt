package com.example.myapplicationtest.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.myapplicationtest.ui.DetailScreen
import com.example.myapplicationtest.ui.MainScreen


@Composable
fun NavigationController() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Main) {
        composable<Main> {
            MainScreen { message -> navController.navigate(Detail(message = message)) }
        }

        composable<Detail> { backStackEntry ->
            val detail: Detail = backStackEntry.toRoute()
            DetailScreen(message = detail.message, navigateBack = { navController.navigateUp() })
        }
    }
}
