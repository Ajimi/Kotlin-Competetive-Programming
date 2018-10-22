import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val m = reader.nextInt()

    val list = mutableListOf<Pair<Int, Int>>()
    (1..m).forEach {
        val a = reader.nextInt()
        val b = reader.nextInt()
        list.add(Pair(a, b))
    }

    var matchBoxesLeft = n
    var matches = 0
    list.sortedByDescending { it.second }.map {
        if (matchBoxesLeft <= 0)
            return@map

        matchBoxesLeft -= it.first
        if (matchBoxesLeft >= 0) {
            matches += it.first * it.second
        } else {
            matchBoxesLeft += it.first
            matches += (matchBoxesLeft) * it.second
            matchBoxesLeft -= it.first
        }
    }
    print(matches)
}


// n == 7 && a = 5
//
//      matcheBoxLeft = n - a
