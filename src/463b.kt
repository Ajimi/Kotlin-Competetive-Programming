fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val pylons = readLine()!!.split(" ").map { it.toInt() }


    var energy = 0
    var dollars = 0

    var previous = 0
    pylons.forEachIndexed { index, item ->
        energy += previous - item;
        if (energy < 0) {
            dollars += -energy;
            energy = 0;
        }
        previous = item;

    }

    print(dollars)

}