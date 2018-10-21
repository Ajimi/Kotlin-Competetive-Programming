import java.lang.Math.abs

fun main(args: Array<String>) {
    val (n, a) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0


    (1..n).forEach { i ->

        if (list[i - 1] == 1) {
            val distance = i - a // distance from a
            val j = a - distance - 1// the other city at the same distance
            if (j < 1 || j > n || list[i - 1] == list[j])
                ++sum

        }
    }
    print(sum)
}

//6 3
//1 1 1 0 1 0
//0 1 0 1 1 1