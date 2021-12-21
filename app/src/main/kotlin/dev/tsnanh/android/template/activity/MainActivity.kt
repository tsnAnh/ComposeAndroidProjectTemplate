package dev.tsnanh.android.template.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.CompositionLocalProvider
import dev.tsnanh.android.template.app.appProvider
import dev.tsnanh.android.template.di.LocalAppProvider
import dev.tsnanh.android.template.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(
                LocalAppProvider provides application.appProvider
            ) {
                MaterialTheme {
                    Navigation()
                }
            }
        }
    }
}
