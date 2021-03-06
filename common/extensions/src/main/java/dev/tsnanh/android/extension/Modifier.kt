package dev.tsnanh.android.extension

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

inline fun Modifier.noRippleClickable(crossinline onClick: () -> Unit = {}) = composed {
    clickable(
        indication = null,
        interactionSource = remember {
            MutableInteractionSource()
        }
    ) { onClick() }
}
