import java.lang.Math.abs

fun main(args: Array<String>) {
    var x = -1
    var y = -1

    (1..5).forEach {

        if(y == -1){
            y = readLine()!!.split(" ").map { it.toInt() }.indexOf(1)
        }
        else{
            readLine()!!
        }
        if(y != -1 && x == -1)
            x = it-1

    }

    print(abs(y-2) + abs(x-2))
}