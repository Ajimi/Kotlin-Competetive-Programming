import kotlin.math.abs

fun main(args: Array<String>) {

    var (a,b) = readLine()!!.split(" ").map { it.toInt() }
    var year = 0
    while (a <= b){
        a = a*3
        b = b*2
        year++
    }
    print(year)
// Mind Solution
//    val arr = listOf<Int>(1,1,1,2,2,3,3,6,6)
//    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
//    if(abs(a-b) == 9){
//        print(6)
//        return
//    }
//    if((a%2 == 0) && (b%2 == 0) && a != b)
//        print(arr[abs(a-b)] +1 )
//    else
//        print(arr[abs(a-b)])

}