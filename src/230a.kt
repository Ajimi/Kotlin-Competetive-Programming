import java.util.*

fun main(args: Array<String>) {
    var strength: Int
    val rounds: Int
    var list = mutableListOf<Pair<Int, Int>>()
    val reader = Scanner(System.`in`)
    strength = reader.nextInt()
    rounds = reader.nextInt()


    (1..rounds).forEach {
        val a = reader.nextInt()
        val b = reader.nextInt()
        list.add(Pair(a, b))
    }

    list.sortedBy { it.first }.forEach {
        if (it.first >= strength) {
            print("NO")
            return
        }

        strength += it.second
    }
    print("YES")
}