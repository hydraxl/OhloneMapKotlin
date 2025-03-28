package backend

data class Path(
    val id: String,
    val locations: Pair<Location, Location>,
    val isBoundary: Boolean = false)