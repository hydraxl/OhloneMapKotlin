package rats.projects.ohlone_map

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform