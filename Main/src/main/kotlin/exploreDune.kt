fun main() {
    exploreDune(20 ,3.0)
}

fun exploreDune(height: Int, climbRate: Double) {
    var time = climbRate * height

    return println("Time to Climb the Dune: $time hours")
}