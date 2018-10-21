fun main(args: Array<String>) {
    val firstString =readLine()!!.toLowerCase()
    val secondString =readLine()!!.toLowerCase()
    print(compareTo(firstString.compareTo(secondString)))
}

fun compareTo(int:Int): Int{
    return when {
        int in 1.. Int.MAX_VALUE -> 1
        int == 0 -> 0
        else -> -1
    }
}