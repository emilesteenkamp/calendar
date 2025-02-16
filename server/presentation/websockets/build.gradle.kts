plugins {
    application
    alias(libs.plugins.kotlinJvm)
}

dependencies {
    implementation(projects.server.application)
    implementation(libs.ktor.server.websockets)
}