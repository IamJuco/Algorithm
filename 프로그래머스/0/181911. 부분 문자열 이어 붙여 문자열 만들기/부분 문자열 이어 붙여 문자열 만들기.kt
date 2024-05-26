class Solution {
    fun solution(myStr: Array<String>, parts: Array<IntArray>): String {
        val sb = StringBuilder()
        for (i in myStr.indices) {
            sb.append(myStr[i].substring(parts[i][0], parts[i][1] + 1))
        }

        return sb.toString()
    }
}