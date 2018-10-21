fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val str = readLine()!!;
    var anton = 0;
    var danik = 0;
    str.forEach {
        if(it == 'A'){
            anton++
        } else {
            danik++
        }
        if(anton > x / 2) {
            print("Anton")
            return
        } else if (danik > x /2) {
            print("Danik")
            return
        }
    }

    print("Friendship")

}

