package variants

import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class ApplicationVariantsPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension =
            project.extensions.getByName("androidComponents") as ApplicationAndroidComponentsExtension

        extension.beforeVariants { variantBuilder ->
            if (variantBuilder.name == "debug") {
                variantBuilder.run {
                    enableUnitTest = false
                    enableAndroidTest = false
                }
            }
        }

        extension.finalizeDsl { ext ->
            // create some build types
            listOf(Alpha, Beta, ReleaseCandidate).forEach { variant ->
                ext.buildTypes.create(variant.name).run {
                    variant.configure(this)
                }
            }

            listOf(Debug, Release).forEach { buildType ->
                buildType.configure(ext.buildTypes.getByName(buildType.name))
            }
        }
    }
}
