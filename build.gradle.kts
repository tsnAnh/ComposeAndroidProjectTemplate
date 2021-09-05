buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(ProjectPlugins.AndroidGradlePlugin)
        classpath(ProjectPlugins.KotlinGradlePlugin)
    }
}

plugins {
    id(Plugins.Detekt) version Versions.DetektVersion
    id(Plugins.Ktlint) version Versions.KtlintVersion
}

tasks.withType<io.gitlab.arturbosch.detekt.Detekt>().configureEach {
    // Target version of the generated JVM bytecode. It is used for type resolution.
    jvmTarget = "11"
}

configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    debug.set(true)
    enableExperimentalRules.set(true)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
