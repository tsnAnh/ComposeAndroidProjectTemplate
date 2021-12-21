import variants.ApplicationVariantsPlugin

plugins {
    id(Plugins.AndroidApplication)
    kotlin(Plugins.KotlinAndroid)
    kotlin(Plugins.KotlinKapt)
    id(Plugins.KotlinParcelize)
    id(Plugins.Detekt)
    id(Plugins.Ktlint)
    id(Plugins.GoogleServices)
    id(Plugins.Crashlytics)
}

apply<ApplicationVariantsPlugin>()

android {
    buildToolsVersion = Versions.BuildToolsVersion

    compileSdk = Configs.CompileSdkVersion

    defaultConfig {
        applicationId = Configs.ApplicationId
        minSdk = Configs.MinSdkVersion
        targetSdk = Configs.TargetSdkVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName(BuildTypes.Release) {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName(BuildTypes.Debug) {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        compose = true
        dataBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        allWarningsAsErrors = true
        jvmTarget = "11"
        freeCompilerArgs = listOf("-Xopt-in=kotlin.RequiresOptIn")
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.ComposeCompilerVersion
    }

    packagingOptions {
        fun exclude(path: String) {
            resources.excludes.add(path)
        }
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE")
        exclude("META-INF/LICENSE.txt")
        exclude("META-INF/license.txt")
        exclude("META-INF/NOTICE")
        exclude("META-INF/NOTICE.txt")
        exclude("META-INF/notice.txt")
        exclude("META-INF/ASL2.0")
        exclude("META-INF/LGPL2.1")
        exclude("META-INF/AL2.0")
        exclude("META-INF/*.kotlin_module")
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {
    implementation(project(":features:example:example-impl"))
    implementation(project(":features:example2:example2-impl"))
    implementation(project(":core:navigation"))
    implementation(project(":common:utils"))

    coreLibraryDesugaring(AndroidSupportLibraries.CoreLibraryDesgaring)

    implementation(AndroidSupportLibraries.Material)
    implementation(AndroidSupportLibraries.AppCompat)
    implementation(ComposeLibraries.ComposeUI)
    // Tooling support (Previews, etc.)
    implementation(ComposeLibraries.ComposeUITooling)
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation(ComposeLibraries.ComposeFoundation)
    // Material Design
    implementation(ComposeLibraries.ComposeMaterial)
    // Material design icons
    implementation(ComposeLibraries.ComposeMaterialIconsCore)
    implementation(ComposeLibraries.ComposeMaterialIconsExtended)
    // Integration with observables
    implementation(ComposeLibraries.ComposeLiveData)
    implementation(AndroidSupportLibraries.AndroidXCore)
    implementation(KotlinLibraries.CoroutinesCore)
    testImplementation(KotlinLibraries.CoroutinesTest)
    implementation(AndroidSupportLibraries.Timber)
    implementation(ComposeLibraries.ActivityCompose)
    implementation(ComposeLibraries.ComposeNavigation)
    implementation(AndroidSupportLibraries.CoreSplashScreen)
    implementation(DaggerLibraries.Dagger)
    implementation(DaggerLibraries.DaggerAndroid)
    kapt(DaggerLibraries.DaggerCompiler)
    implementation(Accompanist.NavigationMaterial)
    implementation(Accompanist.NavigationAnimation)
    // UI Tests
    androidTestImplementation(AndroidTestLibraries.ComposeUIJUnit4)
    androidTestImplementation(AndroidTestLibraries.AndroidJUnit4)
    androidTestImplementation(AndroidTestLibraries.Espresso)
    // Test
    testImplementation(TestLibraries.jUnit4)
}

detekt {
    // Version of Detekt that will be used. When unspecified the latest detekt
    // version found will be used. Override to stay on the same version.
    toolVersion = "1.18.1"

    // The directories where detekt looks for source files.
    // Defaults to `files("src/main/java", "src/test/java", "src/main/kotlin", "src/test/kotlin")`.
    source = files("src/main/java", "src/main/kotlin")

    // Builds the AST in parallel. Rules are always executed in parallel.
    // Can lead to speedups in larger projects. `false` by default.
    parallel = false

    // Define the detekt configuration(s) you want to use.
    // Defaults to the default detekt configuration.
    config = files("$rootDir/detekt/detekt-config.yml")

    // Applies the config files on top of detekt's default config file. `false` by default.
    buildUponDefaultConfig = false

    // Turns on all the rules. `false` by default.
    allRules = false

    // Disables all default detekt rulesets and will only run detekt with custom rules
    // defined in plugins passed in with `detektPlugins` configuration. `false` by default.
    disableDefaultRuleSets = false

    // Adds debug output during task execution. `false` by default.
    debug = false

    // If set to `true` the build does not fail when the
    // maxIssues count was reached. Defaults to `false`.
    ignoreFailures = false

    // Android: Don't create tasks for the specified build types (e.g. "release")
    ignoredBuildTypes = listOf("release")

    // Android: Don't create tasks for the specified build flavor (e.g. "production")
    ignoredFlavors = emptyList()

    // Android: Don't create tasks for the specified build variants (e.g. "productionRelease")
    ignoredVariants = emptyList()

    // Specify the base path for file paths in the formatted reports.
    // If not set, all file paths reported will be absolute file path.
    basePath = projectDir.path

    reports {
        // Enable/Disable HTML report (default: true)
        html {
            enabled = true
            destination = file("build/reports/detekt/detekt.html")
        }
        // Enable/Disable TXT report (default: true)
        txt {
            enabled = true
            destination = file("build/reports/detekt/detekt.txt")
        }
    }
}
