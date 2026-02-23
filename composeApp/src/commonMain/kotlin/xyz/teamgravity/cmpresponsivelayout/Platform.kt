package xyz.teamgravity.cmpresponsivelayout

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform