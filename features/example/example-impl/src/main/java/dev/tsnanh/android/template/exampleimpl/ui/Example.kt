package dev.tsnanh.android.template.exampleimpl.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.tsnanh.android.template.exampleimpl.ExampleViewModel

@Composable
fun Example(viewModel: ExampleViewModel) {
    val text by viewModel.text
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = text, modifier = Modifier.align(Alignment.Center))
    }
}
