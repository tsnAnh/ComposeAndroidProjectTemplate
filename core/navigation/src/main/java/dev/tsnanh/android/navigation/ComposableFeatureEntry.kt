package dev.tsnanh.android.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.composable

interface ComposableFeatureEntry : FeatureEntry {
    @OptIn(ExperimentalAnimationApi::class)
    fun NavGraphBuilder.composable(
        navController: NavHostController,
        destinations: Destinations,
    ) {
        composable(featureRoute, arguments, deepLinks) { navBackStackEntry ->
            Composable(navController, destinations, navBackStackEntry)
        }
    }

    @Composable
    fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        navBackStackEntry: NavBackStackEntry
    )
}
