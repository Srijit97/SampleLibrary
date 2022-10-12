package com.srijit.samplelibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform