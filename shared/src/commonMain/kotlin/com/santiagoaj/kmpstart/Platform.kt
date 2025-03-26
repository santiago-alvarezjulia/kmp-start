package com.santiagoaj.kmpstart

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform