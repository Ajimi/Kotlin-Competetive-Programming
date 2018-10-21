class MaHeap {
    val heap: MutableList<Int> = mutableListOf<Int>()

    fun insert(value: Int) {
        heap.add(value)
        var length: Int = heap.size
        if (length == 1)
            return
        swapIfPossible(length - 1)
    }

    private fun swapIfPossible(n: Int) {

        var position = n
        var parent = heap[(position - 1) / 2]
        var current = heap[position]
        while (parent < current) {
            heap[(position - 1) / 2] = current
            heap[position] = parent
            position = (position - 1) / 2
            parent = heap[(position - 1) / 2]
            current = heap[position]
        }
    }

    fun print() {
        print(heap)
    }
}

fun main(args: Array<String>) {
    var max: MaHeap = MaHeap()

    (1..15).forEach({
        max.insert(it)
    })
    max.print()

}

class MaxHeap<T : Comparable<T>>() {
    private val items = mutableListOf<T?>()
    var size: Int = 0
        private set
        get() = items.size

    fun push(item: T) {
        set(size + 1, item)
        siftUp(size - 1)
    }

    fun peek() = get(0)

    fun pop(): T? {
        // If there are no items in the heap, null is returned
        if (size == 0) {
            return null
        }

        // Get the max item, replace it with the last item in the heap,
        // then sift it down until the heap property is restored
        val max = peek()
        set(0, get(size - 1))
        items.removeAt(items.lastIndex) // Remove original reference to the last item
        siftDown(0)
        return max
    }

    private fun siftUp(i: Int) {
        assert(i >= 0 && i < size)

        // The root node has no parent, so we cannot sift up any more
        if (i == 0) {
            return
        }

        // If the current item is larger than the parent, swap them and
        // then repeat on the item, which is now in the parent position
        val iParent = parentIndex(i)
        if (get(i)!! > get(iParent)!!) {
            swap(i, iParent)
            siftUp(iParent)
        }
    }

    private fun siftDown(i: Int) {
        assert(i >= 0 && i < size)

        // Cannot sift down leaf nodes
        if (i >= size / 2) {
            return
        }

        // Find the larger child value.
        // Left child is guaranteed to exist because this is not a leaf node,
        // and because we add items to the heap by appending them to the end,
        // the left mode must be filled before the right node.
        val iLeft = leftChildIndex(i)
        val iRight = rightChildIndex(i)
        var iLargerChild = iLeft
        if (iRight < size && get(iLeft)!! < get(iRight)!!) {
            iLargerChild = iRight
        }

        // If this item is less than the larger child, sift it down
        if (get(i)!! < get(iLargerChild)!!) {
            swap(i, iLargerChild)
            siftDown(iLargerChild)
        }
    }

    private fun set(i: Int, value: T?) {
        if (i < items.size) {
            items[i] = value
        } else {
            items.add(value)
        }
    }

    private fun get(i: Int): T? {
        if (i < items.size) {
            return items[i]
        } else {
            return null
        }
    }

    private fun swap(i: Int, j: Int) {
        val temp = items[i]
        items[i] = items[j]
        items[j] = temp
    }

    private fun parentIndex(i: Int) = (i - 1) / 2
    private fun leftChildIndex(i: Int) = i * 2 + 1
    private fun rightChildIndex(i: Int) = i * 2 + 2
}