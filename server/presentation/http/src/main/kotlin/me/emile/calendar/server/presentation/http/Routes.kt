package me.emile.calendar.server.presentation.http

import io.ktor.server.response.respondText
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import me.emile.calendar.server.application.Greeter

fun Routing.routes(greeter: Greeter) {
    get("/") {
        call.respondText(greeter.invoke())
    }
}