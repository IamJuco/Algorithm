fun main() {
    val input = readln().toInt()
    when(input) {
        in 380 until 425 -> println("Violet")
        in 425 until 450 -> println("Indigo")
        in 450 until 495 -> println("Blue")
        in 495 until 570 -> println("Green")
        in 570 until 590 -> println("Yellow")
        in 590 until 620 -> println("Orange")
        in 620 .. 780 -> println("Red")
    }
}