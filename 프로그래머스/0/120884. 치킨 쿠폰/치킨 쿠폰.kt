class Solution {
    fun solution(chicken: Int): Int {
    var answer = 0
    var count = chicken

    while (count >= 10) {
        answer += count / 10
        count = count / 10 + count % 10
    }

    return answer
}
}