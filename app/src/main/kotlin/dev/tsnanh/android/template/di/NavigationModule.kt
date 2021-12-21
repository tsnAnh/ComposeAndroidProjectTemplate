package dev.tsnanh.android.template.di

import dagger.Module
import dev.tsnanh.android.template.exampleimpl.di.ExampleEntryModule

@Module(
    includes = [
        ExampleEntryModule::class
    ]
)
interface NavigationModule
