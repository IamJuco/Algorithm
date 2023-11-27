import java.util.Scanner;

// 5 = 바구니갯수, 바구니는 번호가 매겨져있다.
// 바구니에 공이 1개씩 있음
// 처음에는 바구니번호랑 같은 번호가 적힌공이 들어있음
// 4 = 공을 바꿀횟수
// 공을 바꿀 바구니 2개 선택 후 두바구니에 들어있는 공을 서로 교환
// M번 공을 바꾼이후 각 바구니에 어떤 공이 들어있을지
// 1st = 1 2 3 4 5
// 2nd = 2 1 3 4 5
// 3th = 2 1 4 3 5
// 4th = 3 1 4 2 5
// 5th = 3 1 4 2 5
// 배열 I 와 J 의 숫자를 바꿔줘야함. 그리고 출력
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        
        int M = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 1; i <= M; i++) {
            int I = sc.nextInt() - 1;
            int J = sc.nextInt() - 1;
            int temp = array[I];
            array[I] = array[J];
            array[J] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}