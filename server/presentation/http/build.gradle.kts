plugins {
    application
    alias(libs.plugins.kotlinJvm)
}

dependencies {
    implementation(projects.api)
    implementation(projects.server.application)

    implementation(libs.ktor.server.core)
}