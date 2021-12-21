package dev.tsnanh.android.template.example

import dev.tsnanh.android.navigation.ComposableFeatureEntry

abstract class ExampleEntry : ComposableFeatureEntry {
    final override val featureRoute: String = "example"

    fun destination() = featureRoute
}
