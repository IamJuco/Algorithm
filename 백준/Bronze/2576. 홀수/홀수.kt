fun main() {
    var oddArr = intArrayOf()
    var oddSum = 0

    for (i in 0..6) {
        val input = readln().toInt()
        if (input % 2 != 0) {
            oddArr += input
            oddSum += input
        }
    }

    if (oddSum == 0) {
        println(-1)
    } else {
        println(oddSum)
        println(oddArr.sorted()[0])
    }
}