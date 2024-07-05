class Solution {
    fun solution(str: String, num1: Int, num2: Int): String {
        val list = str.toCharArray()
        val temp = list[num1]
        list[num1] = list[num2]
        list[num2] = temp

        return list.joinToString("")
    }
}