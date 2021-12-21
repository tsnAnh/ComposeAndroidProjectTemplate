package dev.tsnanh.android.template.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import dev.tsnanh.android.navigation.Destinations
import dev.tsnanh.android.navigation.find
import dev.tsnanh.android.template.di.LocalAppProvider
import dev.tsnanh.android.template.example.ExampleEntry

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation() {
    val navController = rememberAnimatedNavController()
    val destinations: Destinations = LocalAppProvider.current.destinations

    val example = destinations.find<ExampleEntry>()
    Box(modifier = Modifier.fillMaxSize()) {
        AnimatedNavHost(navController = navController, startDestination = example.destination()) {
            with(example) {
                composable(navController, destinations)
            }
        }
    }
}

