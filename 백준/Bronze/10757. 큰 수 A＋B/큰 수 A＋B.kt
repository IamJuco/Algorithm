fun main() {
    println(readln().split(" ").map {java.math.BigInteger(it) }.sumOf { it })
}