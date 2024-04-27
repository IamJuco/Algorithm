class Solution {
fun solution(my_string: String): String {
    var answer: String = ""

    for (i in my_string) {
        if (i.isUpperCase()) {
            answer += i.toString().lowercase()
        }else if (i.isLowerCase()) {
            answer += i.toString().uppercase()
        }

    }
    return answer
}
}