class Solution {
    fun solution(dot: IntArray): Int = when {
        (dot[0] > 0 && dot[1] > 0) -> 1
        (dot[0] > 0 && dot[1] < 0) -> 4
        (dot[0] < 0 && dot[1] > 0) -> 2
        else -> 3
    }
}