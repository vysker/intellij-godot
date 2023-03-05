import java.nio.file.Files

plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.13.1"
}

group = "nl.vysk.intellij"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2022.1.4")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf(/* Plugin Dependencies */))
}

sourceSets["main"].java.srcDirs("src/main/gen")

val buildResourcesDir = "${project.buildDir}/resources"

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    patchPluginXml {
        sinceBuild.set("221")
        untilBuild.set("231.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }

    buildPlugin {
        dependsOn("gatherGodotDocs")
    }

    runIde {
        environment("RESOURCES_DIR", buildResourcesDir)
    }
}

tasks.register("gatherGodotDocs") {
    val docsDir = file("$buildResourcesDir/godot-docs").toPath()
    doFirst {
        Files.createDirectories(docsDir)
    }
    doLast {
        exec {
            // https://docs.godotengine.org/en/latest/tutorials/editor/command_line_tutorial.html
            commandLine("godot", "--doctool", docsDir)
        }
    }
}
