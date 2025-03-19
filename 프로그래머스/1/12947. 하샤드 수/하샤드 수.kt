class Solution {
fun solution(x: Int): Boolean {
    val sum =  x.toString().map { it.toString().toInt() }.sum()
    val answer = if (x % sum == 0) true else false
    return answer
}
}