package me.emile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform