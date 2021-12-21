package dev.tsnanh.android.template.di

import dagger.Component
import dev.tsnanh.android.navigation.NavigationProvider
import javax.inject.Singleton

@Singleton
@Component(
    modules = [NavigationModule::class],
    dependencies = [NavigationProvider::class]
)
interface AppComponent : AppProvider
