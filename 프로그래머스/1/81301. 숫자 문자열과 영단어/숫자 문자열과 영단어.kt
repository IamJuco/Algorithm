class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var str = s
        var numList = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        for (i in 0.. numList.size-1){
            str = str.replace(numList[i], i.toString())
        }
        answer = str.toInt()

        return answer
    }
}