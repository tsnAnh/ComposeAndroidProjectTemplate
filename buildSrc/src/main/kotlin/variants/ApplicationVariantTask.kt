package variants

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import com.android.build.api.variant.ApplicationAndroidComponentsExtension

abstract class ApplicationVariantTask : DefaultTask() {
    @TaskAction
    fun taskAction() {
    }
}
