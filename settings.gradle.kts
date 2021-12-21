@file:Suppress("UnstableApiUsage", "DEPRECATION")

@Suppress("JcenterRepositoryObsolete") dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}

@Suppress("JcenterRepositoryObsolete") pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
}

// Change your project's name here
rootProject.name = "ComposeAndroidProjectTemplate"

// App module
include(":app")

// Common modules
include(":common:models")
include(":common:composables")
include(":common:extensions")
include(":common:utils")

// Core modules
include(":core:datasource:network")
include(":core:datasource:cache")
include(":core:data")
include(":core:navigation")

// Feature modules
include(":features:example:example-api")
include(":features:example:example-impl")
include(":features:example2:example2-api")
include(":features:example2:example2-impl")
