@file:Suppress("NOTHING_TO_INLINE")

package dev.tsnanh.android.composables.utils

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.rememberInsetsPaddingValues

@Composable
inline fun HeightSpacer(height: Dp) {
    Spacer(modifier = Modifier.height(height))
}

@Composable
inline fun WidthSpacer(width: Dp) {
    Spacer(modifier = Modifier.width(width))
}

@Composable
inline fun getTopBarContentPadding() = rememberInsetsPaddingValues(
    insets = LocalWindowInsets.current.statusBars,
    applyStart = true,
    applyEnd = true,
    applyTop = true
)
