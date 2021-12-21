object KotlinLibraries {
    const val CoroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.CoroutinesVersion}"
    const val CoroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.CoroutinesVersion}"
    const val SerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.SerializationJson}"

    const val CoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.CoroutinesVersion}"
}

object AndroidSupportLibraries {
    const val CoreSplashScreen = "androidx.core:core-splashscreen:${Versions.CoreSplashScreenVersion}"
    const val Material = "com.google.android.material:material:${Versions.MaterialVersion}"
    const val AppCompat = "androidx.appcompat:appcompat:${Versions.AppCompat}"
    const val AndroidXCore = "androidx.core:core-ktx:${Versions.AndroidXCoreVersion}"
    const val Timber = "com.jakewharton.timber:timber:${Versions.TimberVersion}"
    const val CoreLibraryDesgaring = "com.android.tools:desugar_jdk_libs:${Versions.CoreLibraryDesugaringVersion}"
    const val Navigation = "androidx.navigation:navigation-compose:${Versions.ComposeNavigation}"
}

object ComposeLibraries {
    const val ComposeUI = "androidx.compose.ui:ui:${Versions.ComposeVersion}"
    const val ComposeUITooling = "androidx.compose.ui:ui-tooling:${Versions.ComposeVersion}"
    const val ComposeFoundation =
        "androidx.compose.foundation:foundation:${Versions.ComposeVersion}"
    const val ComposeMaterial =
        "androidx.compose.material:material:${Versions.ComposeVersion}"
    const val ComposeMaterialIconsCore =
        "androidx.compose.material:material-icons-core:${Versions.ComposeVersion}"
    const val ComposeMaterialIconsExtended =
        "androidx.compose.material:material-icons-extended:${Versions.ComposeVersion}"
    const val ComposeLiveData =
        "androidx.compose.runtime:runtime-livedata:${Versions.ComposeVersion}"
    const val ActivityCompose = "androidx.activity:activity-compose:${Versions.ActivityComposeVersion}"
    const val ComposeNavigation = "androidx.navigation:navigation-compose:${Versions.ComposeNavigation}"
    const val Navigation = "androidx.navigation:navigation-compose:${Versions.ComposeNavigation}"
}

object DaggerLibraries {
    const val Dagger = "com.google.dagger:dagger:${Versions.DaggerVersion}"
    const val DaggerAndroid = "com.google.dagger:dagger:${Versions.DaggerVersion}"
    const val DaggerCompiler = "com.google.dagger:dagger-compiler:${Versions.DaggerVersion}"
}

object Accompanist {
    const val Insets = "com.google.accompanist:accompanist-insets:${Versions.Accompanist}"
    const val Permission = "com.google.accompanist:accompanist-permissions:${Versions.Accompanist}"
    const val SystemUiController = "com.google.accompanist:accompanist-systemuicontroller:${Versions.Accompanist}"
    const val DrawablePainter = "com.google.accompanist:accompanist-drawablepainter:${Versions.Accompanist}"
    const val NavigationAnimation = "com.google.accompanist:accompanist-navigation-animation:${Versions.Accompanist}"
    const val NavigationMaterial = "com.google.accompanist:accompanist-navigation-material:${Versions.Accompanist}"
    const val Placeholder = "com.google.accompanist:accompanist-placeholder:${Versions.Accompanist}"
}

object Network {
    const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit}"
    const val OkHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.OkHttp}"
    const val KotlinSerializationRetrofitConverter =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
    const val OkHttp = "com.squareup.okhttp3:okhttp:${Versions.OkHttp}"
}

object Arrow {
    const val ArrowCore = "io.arrow-kt:arrow-core:${Versions.Arrow}"
    const val ArrowCoroutines = "io.arrow-kt:arrow-fx-coroutines:${Versions.Arrow}"
    const val ArrowSTM = "io.arrow-kt:arrow-fx-stm:${Versions.Arrow}"
}

object TestLibraries {
    const val jUnit4 = "junit:junit:${Versions.JUnit4}"
    const val MockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.OkHttp}"
}

object AndroidTestLibraries {
    const val ComposeUIJUnit4 =
        "androidx.compose.ui:ui-test-junit4:${Versions.ComposeVersion}"

    const val AndroidJUnit4 = "androidx.test.ext:junit:${Versions.AndroidJUnit4}"
    const val Espresso = "androidx.test.espresso:espresso-core:${Versions.Espresso}"
}
