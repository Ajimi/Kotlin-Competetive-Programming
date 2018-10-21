fun main(args: Array<String>) {
    val size = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }.toList()


    var max = 0
    list.forEachIndexed { index, element ->
        var (right, left) = getRightAndLeft(index)

        var sumLeft = 0
        var currentLeft = 0
        var canGoLeft: Boolean = false

        if (index == 0) {
            canGoLeft = false
        } else {
            currentLeft = list[left]
            canGoLeft = leftable(left, element, currentLeft)
        }

        while (canGoLeft) {
            sumLeft++
            if (left >= 0)
                currentLeft = list[left]
            left--
            if (left == -1)
                canGoLeft = false
            else
                canGoLeft = leftable(left, currentLeft, list[left])
        }

        var sumRight = 0
        var canGoRight = false
        var currentRight = 0

        if (index == size - 1)
            canGoRight = false
        else {
            currentRight = list[right]
            canGoRight = rightable(right, size, element, currentRight)
        }


        while (canGoRight) {
            sumRight++
            if (right < size)
                currentRight = list[right]
            right++
            if (right == size)
                canGoRight = false
            else
                canGoRight = rightable(right, size, currentRight, list[right])

        }

        if (sumRight + sumLeft > max) {
            max = sumRight + sumLeft
        }
        if (max == size - 1) {
            return@forEachIndexed
        }

    }

    print(max + 1)

//
}


private fun leftable(left: Int, element: Int, item: Int) =
        (left >= 0 && element >= item)

private fun rightable(right: Int, size: Int, element: Int, item: Int) =
        (right < size && element >= item)


fun getRightAndLeft(index: Int): Pair<Int, Int> {
    return Pair(index + 1, index - 1)
}
