package src.commonMain

data class Location(
    val id: String,
    val locationType: String,
    val sectors: Set<Sector> = setOf())