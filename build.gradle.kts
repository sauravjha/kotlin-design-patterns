import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.5.0"

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.12")
    testImplementation("org.spekframework.spek2:spek-runtime-jvm:2.0.12")

    testImplementation("org.spekframework.spek2:spek-runner-junit5:2.0.12")
    testImplementation("io.mockk:mockk:1.10.2")

    testImplementation("com.natpryce:hamkrest:1.4.2.0")

    testImplementation("io.mockk:mockk:1.10.2")
}

tasks {
    test {
        useJUnitPlatform {
            includeEngines("spek2")
        }
        testLogging.showExceptions = true
    }
}


application {
    // Define the main class for the application.
    mainClassName = "sample.AppKt"
}