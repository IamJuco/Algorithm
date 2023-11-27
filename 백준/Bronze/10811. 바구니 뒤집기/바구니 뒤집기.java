import java.util.*;

// 5 = 바구니 갯수
// 4 = 역순으로 바꿀 횟수
// 1st = 1 2 3 4 5
// 2nd = 2 1 3 4 5
// 3th = 2 1 4 3 5
// 4th = 3 4 1 2 5
// 5th = 3 4 1 2 5
// 배열을 I 부터 J 까지 역순으로 바꿔주기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int[] temp = new int[array.length];

        int M = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 1; i <= M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            for (int j = a; j <= b; j++) {
                temp[j] = array[j];
            }
            // 역순으로 해주기
            for (int j = b, k = a; j >= a; j--, k++) {
                array[k] = temp[j];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}