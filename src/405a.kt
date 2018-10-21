fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    readLine()!!.split(" ").map { it.toInt() }.sorted().forEach({ print("${it} ") })
}