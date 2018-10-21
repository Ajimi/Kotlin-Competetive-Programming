fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var sum = 0
    while (n-- > 0){
        if (readLine()!!.split(" ").map { it.toInt() }.sum() > 1)
            sum++
    }
    print(sum)
}