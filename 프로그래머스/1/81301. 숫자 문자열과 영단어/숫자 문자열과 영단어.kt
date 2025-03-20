class Solution {
    enum class NumberWord(val word: String, val number: String) {
        ZERO("zero", "0"), ONE("one", "1"), TWO("two", "2"),
        THREE("three", "3"), FOUR("four", "4"), FIVE("five", "5"),
        SIX("six", "6"), SEVEN("seven", "7"), EIGHT("eight", "8"),
        NINE("nine", "9");
    }

    fun solution(s: String): Int {
        var answer = s
        for (i in NumberWord.values()) {
            answer = answer.replace(i.word, i.number)
        }
        return answer.toInt()
    }
}