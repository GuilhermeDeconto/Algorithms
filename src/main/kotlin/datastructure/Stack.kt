package datastructure

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/17/22
 **/
class Stack(size: Int) {

    private var stack: Array<Int?>
    private var top: Int = -1
    private var size: Int

    init {
        this.stack = Array(size) { null }
        this.size = size
    }

    fun peek() : Int? {
        if (isEmpty()) {
            throw IllegalArgumentException()
        }

        return stack[top]
    }

    fun push(value: Int) {
        // If stack is full, overflow
        if (isFull()) {
            throw IllegalArgumentException()
        }
        println("Inserting: $value")
        // Push element to top of stack
        top++
        stack[top] = value
    }

    fun pop() : Int? {
        // If is empty, no element to pop
        if (isEmpty()) {
            throw IllegalArgumentException()
        }

        // Pop element
        val result = stack[top]
        stack[top] = null
        top--
        return result
    }

    fun printStack() {
        for (i in top downTo 0) {
            if (stack[i] != null) {
                println("Position $i value: ${stack[i]}")
            }
        }
    }

    fun getSize() : Int {
        return top + 1
    }

    private fun isFull() : Boolean {
        return top >= size - 1
    }

    private fun isEmpty() : Boolean {
        return top < 0
    }
}