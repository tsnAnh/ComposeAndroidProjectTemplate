package dev.tsnanh.android.composables.utils

import android.annotation.SuppressLint
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebViewComposable(
    url: String,
    onWebViewUpdate: (WebView) -> Unit,
    modifier: Modifier = Modifier,
    shouldOverrideUrlLoading: Boolean = false
) {
    AndroidView(
        factory = { ctx ->
            WebView(ctx).apply {
                settings.javaScriptEnabled = true
                loadUrl(url)
                webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(
                        view: WebView?,
                        request: WebResourceRequest?
                    ): Boolean {
                        return shouldOverrideUrlLoading
                    }
                }
            }
        },
        update = onWebViewUpdate,
        modifier = modifier.fillMaxSize()
    )
}

@ExperimentalComposeApi
@SuppressLint("SetJavaScriptEnabled")
@Composable
@JvmName("WebViewComposableHtml")
fun WebViewDataComposable(data: String) {
    AndroidView(
        factory = {
            WebView(it).apply {
                settings.javaScriptEnabled = true
                webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(
                        view: WebView?,
                        request: WebResourceRequest?
                    ): Boolean {
                        return false
                    }
                }
            }
        },
        update = {
            it.loadData(data, "text/html; charset=utf-8", "UTF-8")
        },
        modifier = Modifier.fillMaxSize()
    )
}
