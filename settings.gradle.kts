rootProject.name = "Famous"
include(":composeApp")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://artifactory-external.vkpartner.ru/artifactory/vkid-sdk-android/")
    }
}
