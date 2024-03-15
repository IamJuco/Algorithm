class Solution {
    fun solution(numLog: IntArray): String {
        var control = ""
        for (i in 1 .. numLog.size-1) {
            if (numLog[i] - numLog[i - 1] == 1) {
                control += 'w'
            } else if (numLog[i] - numLog[i - 1] == -1) {
                control += 's'
            } else if (numLog[i] - numLog[i - 1] == 10) {
                control += 'd'
            } else {
                control +=  'a'
            }
        }
        return control
    }
}