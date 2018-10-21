fun main(args: Array<String>) {
    val size = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }.toList()

    var pairsList = mutableListOf<Pair<Int, Int>>()

    (0..list.size - 1).forEach {
        pairsList.add(Pair(it, 1))
    }

    (1..list.size - 2).forEach {
        var sum = 0
        val current = list[it]
        val prev = list[it - 1]
        val next = list[it + 1]
        if (current >= prev)
            sum++
//            sum += pairsList[it - 1].second

        if (current >= next)
            sum++
//            sum += pairsList[it + 1].second
        pairsList[it] = Pair(it, sum)
    }

    print(pairsList)
//    print(pairsList.maxBy { it.second })
}
//
//8
// 1 2 1 1 1 3 3 4