class Solution {
    fun solution(s: String, n: Int): String {
    var answer = ""

    for(char in s){
        if(char == ' ') answer+=' ' //공백이면 공백을 answer에 더하는 것
        else{
            if(char in 'a'..'z'){
                answer+='a'+(char.code-'a'.code+n)%26  //아스키 코드값에서 알파벳(소문자)의 값을 넘어가면 다시 알파벳이 되도록 하는 것
            }else if(char in 'A'..'Z'){
                answer+='A'+(char.code-'A'.code+n)%26  //아스키 코드값에서 알파벳(대문자)의 값을 넘어가면 다시 알파벳이 되도록 하는 것
            }
        }
    }

    return answer //answer 출력
    }
}