import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.apiVersion = "1.3"
}

dependencies {
    implementation("com.android.tools.build:gradle-api:7.0.4")
    implementation(kotlin("stdlib"))
    gradleApi()
}
