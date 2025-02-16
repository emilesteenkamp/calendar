package me.emile.calendar.server.infrastructure

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.routing.routing
import io.ktor.server.websocket.WebSockets
import me.emile.SERVER_PORT
import me.emile.calendar.server.application.Greeter
import me.emile.calendar.server.presentation.http.routes

fun main() =
    embeddedServer(Netty, port = SERVER_PORT, host = "0.0.0.0", module = Application::module).start(wait = true).unit()

fun Application.module() {
    installPlugins()
    setupRouting()
}

fun Application.installPlugins() {
    install(WebSockets)
}

fun Application.setupRouting() {
    val greeter = Greeter()
    routing {
        routes(greeter)
    }
}

private fun Any?.unit() = Unit
