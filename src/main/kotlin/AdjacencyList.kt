package src.commonMain

// supporting classes for json handling
data class Connection(
    val connectionId: String,
    val distance: Int)

data class Adjacency(
    val locationId: String,
    val connections: List<Connection>)

// The class that stores the whole adjacency list
data class AdjacencyList(
    val graph: List<Adjacency>)
