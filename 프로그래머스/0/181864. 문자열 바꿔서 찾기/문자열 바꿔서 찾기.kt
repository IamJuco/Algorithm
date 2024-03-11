class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var str = ""

        str = myString.replace("A", "T")
            .replace("B","A")
            .replace("T","B")
        if (str.contains(pat)){
            answer = 1
        }
        return answer
    }
}