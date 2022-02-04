/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package io.shaded.update

import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.Test
import kotlin.test.assertNotNull

/**
 * A simple unit test for the 'io.shaded.update.greeting' plugin.
 */
class UpdatePluginTest {
    @Test fun `plugin registers task`() {
        // Create a test project and apply the plugin
        val project = ProjectBuilder.builder().build()
        project.plugins.apply("io.shaded.update.greeting")

        // Verify the result
        assertNotNull(project.tasks.findByName("greeting"))
    }
}
