package src.commonMain

data class Sector(
    val id: String,
    val locations: Set<Location> = setOf())