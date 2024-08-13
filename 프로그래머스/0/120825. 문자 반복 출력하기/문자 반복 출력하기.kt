class Solution {
    fun solution(str: String, n: Int): String {
        val a = str.split("")
        val s = StringBuilder()
        for (i in a) {
            for (j in 0 until n) {
                s.append(i)
            }
        }
        return s.toString()
    }
}