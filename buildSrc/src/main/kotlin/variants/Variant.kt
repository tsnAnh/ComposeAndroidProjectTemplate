@file:Suppress("UnstableApiUsage")

package variants

import com.android.build.api.dsl.ApplicationBuildType

interface Variant {
    val name: String

    fun configure(buildType: ApplicationBuildType)

    fun ApplicationBuildType.defaultConfig() {
        isCrunchPngs = true
        isDebuggable = false
        isDefault = false
        isMinifyEnabled = false
        isTestCoverageEnabled = false
        isShrinkResources = false
    }
}

object Debug : Variant {
    override val name = "debug"

    override fun configure(buildType: ApplicationBuildType) {
        buildType.run {
            applicationIdSuffix = ".dev"
            versionNameSuffix = "dev${Configs.DebugVersionCode.toString().padStart(2, '0')}"
            isMinifyEnabled = false
            isShrinkResources = false
            isDefault = true
        }
    }
}

object Alpha : Variant {
    override val name = "alpha"

    override fun configure(buildType: ApplicationBuildType) {
        buildType.defaultConfig()
        buildType.isShrinkResources = false
        buildType.versionNameSuffix =
            "alpha-${Configs.ReleaseVersionCode.toString().padStart(2, '0')}"
    }
}

object Beta : Variant {
    override val name = "beta"

    override fun configure(buildType: ApplicationBuildType) {
        buildType.run {
            defaultConfig()
            isMinifyEnabled = true
            isShrinkResources = true
            versionNameSuffix = "beta-${Configs.ReleaseVersionCode.toString().padStart(2, '0')}"
        }
    }
}

object ReleaseCandidate : Variant {
    override val name = "rc"

    override fun configure(buildType: ApplicationBuildType) {
        buildType.run {
            defaultConfig()
            isMinifyEnabled = true
            isShrinkResources = true
            versionNameSuffix = "-rc${Configs.ReleaseVersionCode.toString().padStart(2, '0')}"
        }
    }
}

object Release : Variant {
    override val name: String = "release"

    override fun configure(buildType: ApplicationBuildType) {
        buildType.run {
            isCrunchPngs = true
            isShrinkResources = true
        }
    }
}
