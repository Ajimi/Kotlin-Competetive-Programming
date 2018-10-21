//fun main(args: Array<String>) {
//    val length = readLine()!!.toInt()
//    val polycrap = readLine()!!.reversed()
//
//    decode(polycrap, length)
//
//}
//
//
//fun decode(str: String, n: Int) {
//
//    var size = n
//    var decodeString = str
//    var position: Int= 0
//    if(n%2==0)
//        position = getPosition(size)
//    else
//        position = getPosition(size,1)
//    print(decodeString[position])
//    var iteration = 1
//    decodeString = removeChar(position, decodeString)
//
//    while (iteration <= n / 2) {
//        size--
//        position = getPosition(size)
//        print(decodeString[position])
//        decodeString = removeChar(position, decodeString)
//        iteration++
//    }
//
//    print(decodeString.reversed())
//}
//
//fun removeChar(position: Int, decodeString: String): String {
//    var k: String = ""
//    for (i in 0..decodeString.length - 1)
//        if (i != position)
//            k += decodeString[i]
//    return k
//
//}
//
//fun getPosition(n: Int, x: Int = 0): Int {
//    return n / 2 - x
//}


fun main(args: Array<String>) {
    val length = readLine()!!.toInt()
    val polycrap = readLine()!!
    var byBegin = length % 2 == 0
    val sb = StringBuilder()
    sb.append(polycrap[0])
    (1 until length).forEach {
        if (byBegin) {
            sb.append(polycrap[it])
        } else {
            sb.insert(0, polycrap[it])
        }
        byBegin = !byBegin
    }
    print(sb.toString())
}