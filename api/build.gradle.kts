plugins {
    application
    kotlin("plugin.serialization") version "2.1.10"
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}