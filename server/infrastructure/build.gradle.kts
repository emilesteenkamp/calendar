plugins {
    application
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
}

dependencies {
    implementation(projects.server.application)
    implementation(projects.server.presentation.http)
    implementation(projects.server.presentation.websockets)
    implementation(projects.server.peripheral)
    implementation(projects.shared)

    implementation(libs.logback)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    implementation(libs.ktor.server.websockets)

    testImplementation(libs.kotlin.test.junit)
}