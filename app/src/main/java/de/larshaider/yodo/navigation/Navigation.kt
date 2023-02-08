package de.larshaider.yodo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.larshaider.yodo.darksouls.DarkSoulsRunOverviewScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.DarkSoulsRunOverviewScreen.route
    ) {
        composable(route = Screen.DarkSoulsRunOverviewScreen.route) {
            DarkSoulsRunOverviewScreen()
        }
    }
}