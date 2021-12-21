package dev.tsnanh.android.extension

import kotlinx.coroutines.Job

fun Job.cancelIfActive() {
    if (isActive) cancel()
}
