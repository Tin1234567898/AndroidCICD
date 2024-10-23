import com.android.build.gradle.internal.registerDependencyCheck

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

plugins{
    id("org.owasp.dependencycheck") version "8.3.2" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}