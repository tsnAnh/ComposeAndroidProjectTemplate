object KotlinLibraries {
    const val CoroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.CoroutinesVersion}"
    const val CoroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.CoroutinesVersion}"
    const val KtorCore = "io.ktor:ktor-client-core:${Versions.KtorVersion}"
    const val KtorLogging = "io.ktor:ktor-client-logging:${Versions.KtorVersion}"
    const val SerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.SerializationJson}"
    const val KtorSerialization = "io.ktor:ktor-client-serialization:${Versions.KtorVersion}"
    const val KoinCore = "io.insert-koin:koin-core:${Versions.KoinVersion}"
    const val KoinKtor = "io.insert-koin:koin-ktor:${Versions.KoinVersion}"

    const val CoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.CoroutinesAndroidVersion}"
    const val KtorAndroid = "io.ktor:ktor-client-android:${Versions.KtorVersion}"

}

object AndroidSupportLibraries {
    const val CoreSplashScreen = "androidx.core:core-splashscreen:${Versions.CoreSplashScreenVersion}"
    const val Material = "com.google.android.material:material:${Versions.MaterialVersion}"
    const val AppCompat = "androidx.appcompat:appcompat:${Versions.AppCompat}"
    const val AndroidXCore = "androidx.core:core-ktx:${Versions.AndroidXCoreVersion}"
    const val Timber = "com.jakewharton.timber:timber:${Versions.TimberVersion}"
}

object KoinLibraries {
    const val KoinAndroid = "io.insert-koin:koin-android:${Versions.KoinVersion}"
    const val KoinWorkManager = "io.insert-koin:koin-androidx-workmanager:${Versions.KoinVersion}"
    const val KoinJetpackCompose = "io.insert-koin:koin-androidx-compose:${Versions.KoinVersion}"
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
}

object TestLibraries {
    const val KoinTest = "io.insert-koin:koin-test:${Versions.KoinVersion}"
    const val KoinJUnit4 = "io.insert-koin:koin-test-junit4:${Versions.KoinVersion}"
    const val jUnit4 = "junit:junit:${Versions.JUnit4}"
}

object AndroidTestLibraries {
    const val ComposeUIJUnit4 =
        "androidx.compose.ui:ui-test-junit4:${Versions.ComposeVersion}"

    const val AndroidJUnit4 = "androidx.test.ext:junit:${Versions.AndroidJUnit4}"
    const val Espresso = "androidx.test.espresso:espresso-core:${Versions.Espresso}"
}
