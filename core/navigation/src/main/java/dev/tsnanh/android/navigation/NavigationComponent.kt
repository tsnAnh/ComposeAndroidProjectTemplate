package dev.tsnanh.android.navigation

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface NavigationComponent : NavigationProvider {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): NavigationComponent
    }
}
