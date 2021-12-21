@file:Suppress("NOTHING_TO_INLINE")

package dev.tsnanh.android.extension

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.content.getSystemService
import java.io.File

fun Activity.hideKeyboard() {
    getSystemService<InputMethodManager>()
        ?.hideSoftInputFromWindow(this.currentFocus?.windowToken, 0)
}

inline fun Context.showToast(message: String, length: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, message, length).show()

fun Context.copyFileToCache(uri: Uri): File {
    val contentResolver = contentResolver
    val tempFile =
        File(cacheDir, contentResolver.getFileNameFromUri(uri))
    val inputStream = contentResolver.openInputStream(uri)
    val os = tempFile.outputStream()
    inputStream?.copyTo(os)
    inputStream?.close()
    os.close()
    return tempFile
}

fun Context.openInBrowser(uri: Uri, title: String) {
    startActivity(
        Intent.createChooser(
            Intent(Intent.ACTION_VIEW).apply {
                data = uri
            },
            title
        )
    )
}

