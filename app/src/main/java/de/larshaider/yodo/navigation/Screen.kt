package de.larshaider.yodo.navigation

sealed class Screen(val route: String) {
    object DarkSoulsRunOverviewScreen : Screen("dark_souls_run_overview_screen")
}