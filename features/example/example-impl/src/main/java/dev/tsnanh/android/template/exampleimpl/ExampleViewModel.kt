package dev.tsnanh.android.template.exampleimpl

import androidx.compose.runtime.mutableStateOf
import dev.tsnanh.android.utils.base.BaseViewModel
import javax.inject.Inject

class ExampleViewModel @Inject constructor() : BaseViewModel() {
    var text = mutableStateOf("Hello World")
        private set
}
