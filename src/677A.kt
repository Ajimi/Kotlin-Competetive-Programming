
fun main(args: Array<String>) {
    val (x, h) = readLine()!!.split(" ").map { it.toInt() }
    print(readLine()!!.split(" ").map({ if (it.toInt() > h)  2 else 1}).sum())
}