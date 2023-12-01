import java.util.Scanner;

// 단어의 첫글자는 = 0번째
// 단어의 두번째는 = 1번째
// 단어에 포함되있지 않으면 -1 출력


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 알파벳 갯수

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 배열에 전부 -1 넣어줌
        }

        String S = sc.next();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i); // 입력값을 넣어줌

            if(arr[ch - 'a'] == -1){ //
                arr[ch - 'a'] = i;
            }
        }
        for (int val: arr) {
            System.out.print(val + " ");
        }
    }
}