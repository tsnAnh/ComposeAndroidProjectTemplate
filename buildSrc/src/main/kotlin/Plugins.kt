object ProjectPlugins {
    const val KotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KotlinVersion}"
    const val AndroidGradlePlugin =
        "com.android.tools.build:gradle:${Versions.AndroidGradlePluginVersion}"
    const val AndroidGradlePluginApi =
        "com.android.tools.build:gradle-api:${Versions.AndroidGradlePluginApiVersion}"
    const val HiltGradlePlugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.DaggerVersion}"
    const val KotlinSerializationPlugin =
        "org.jetbrains.kotlin:kotlin-serialization:${Versions.KotlinVersion}"
    const val GoogleServices = "com.google.gms:google-services:${Versions.GoogleServices}"
    const val Crashlytics = "com.google.firebase:firebase-crashlytics-gradle:${Versions.Crashlytics}"
}

object Plugins {
    const val AndroidApplication = "com.android.application"
    const val AndroidLibrary = "com.android.library"
    const val KotlinAndroid = "android"
    const val KotlinKapt = "kapt"
    const val KotlinParcelize = "kotlin-parcelize"
    const val Detekt = "io.gitlab.arturbosch.detekt"
    const val Ktlint = "org.jlleitschuh.gradle.ktlint"
    const val Hilt = "dagger.hilt.android.plugin"
    const val GoogleServices = "com.google.gms.google-services"
    const val Crashlytics = "com.google.firebase.crashlytics"
}
