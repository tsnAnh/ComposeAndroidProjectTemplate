object ProjectPlugins {
    const val KotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KotlinVersion}"
    const val AndroidGradlePlugin =
        "com.android.tools.build:gradle:${Versions.AndroidGradlePluginVersion}"
}

object Plugins {
    const val AndroidApplication = "com.android.application"
    const val AndroidLibrary = "com.android.library"
    const val KotlinAndroid = "android"
    const val KotlinKapt = "kapt"
    const val KotlinParcelize = "kotlin-parcelize"
    const val Detekt = "io.gitlab.arturbosch.detekt"
    const val Ktlint = "org.jlleitschuh.gradle.ktlint"
}
