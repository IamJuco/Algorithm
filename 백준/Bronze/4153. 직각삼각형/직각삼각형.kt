import kotlin.math.pow

fun main() {
    while (true) {
        val (input1, input2, input3) = readln().split(" ").map { it.toDouble() }
        val inputList = listOf(input1, input2, input3).sorted()

        if (input1 == 0.0 && input2 == 0.0 && input3 == 0.0) {
            break
        }

        if (inputList[0].pow(2.0) + inputList[1].pow(2.0) == inputList[2].pow(2.0)) {
            println("right")
        } else {
            println("wrong")
        }
    }
}