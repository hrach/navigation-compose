@file:Suppress("UnstableApiUsage")

rootProject.name = "NavigationCompose"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when (requested.id.name) {
                "com.android.application" -> useModule("com.android.tools.build:gradle")
            }
        }
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
    buildscript {
        repositories {
            google()
        }
    }
}

dependencyResolutionManagement {
	repositories {
		google()
		mavenCentral()
	}
}

include(":bottomsheet")
include(":modalsheet")
include(":results")
include(":demo")
