class Solution {
    fun solution(str: String): Int {
        val a = str.split("")
        var result = 0
        for (i in a.indices) {
            if (a[i].toIntOrNull() != null) {
                result += a[i].toInt()
            }
        }

        return result
    }
}