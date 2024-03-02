class Solution {
    fun solution(a: Int, b: Int): Int {
        val first = "$a$b"
        val second = "${2 * a * b}"
        return if (first.toInt() > second.toInt() || first.toInt() == second.toInt()) {
            first.toInt()
        } else {
            second.toInt()
        }
    }
}