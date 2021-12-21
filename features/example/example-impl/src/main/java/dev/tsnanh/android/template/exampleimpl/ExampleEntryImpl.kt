package dev.tsnanh.android.template.exampleimpl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import dev.tsnanh.android.navigation.Destinations
import dev.tsnanh.android.navigation.injectViewModel
import dev.tsnanh.android.template.example.ExampleEntry
import dev.tsnanh.android.template.exampleimpl.di.DaggerExampleComponent
import dev.tsnanh.android.template.exampleimpl.ui.Example
import javax.inject.Inject

class ExampleEntryImpl @Inject constructor() : ExampleEntry() {
    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        navBackStackEntry: NavBackStackEntry
    ) {
        val viewModel = injectViewModel {
            DaggerExampleComponent.builder()
                .build()
                .viewModel
        }
        Example(viewModel = viewModel)
    }
}
