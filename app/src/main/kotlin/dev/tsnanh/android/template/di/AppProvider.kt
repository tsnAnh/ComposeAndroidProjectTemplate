package dev.tsnanh.android.template.di

import androidx.compose.runtime.compositionLocalOf
import dev.tsnanh.android.navigation.Destinations
import dev.tsnanh.android.navigation.NavigationProvider
import dev.tsnanh.android.template.activity.MainActivityViewModel

interface AppProvider : NavigationProvider {
    val destinations: Destinations
    val mainActivityViewModel: MainActivityViewModel
}

val LocalAppProvider = compositionLocalOf<AppProvider> { error("No app provider found!") }
