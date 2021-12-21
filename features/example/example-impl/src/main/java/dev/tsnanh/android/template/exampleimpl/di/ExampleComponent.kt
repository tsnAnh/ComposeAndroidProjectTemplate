package dev.tsnanh.android.template.exampleimpl.di

import dagger.Component
import dev.tsnanh.android.template.example.di.ExampleProvider
import dev.tsnanh.android.template.exampleimpl.ExampleViewModel

@Component(modules = [ExampleEntryModule::class])
interface ExampleComponent : ExampleProvider {
    val viewModel: ExampleViewModel
}
