package dev.tsnanh.android.template.exampleimpl.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dev.tsnanh.android.navigation.FeatureEntry
import dev.tsnanh.android.navigation.FeatureEntryKey
import dev.tsnanh.android.template.example.ExampleEntry
import dev.tsnanh.android.template.exampleimpl.ExampleEntryImpl
import javax.inject.Singleton

@Module
abstract class ExampleEntryModule {
    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(ExampleEntry::class)
    abstract fun bindExampleEntry(exampleEntryImpl: ExampleEntryImpl): FeatureEntry
}
