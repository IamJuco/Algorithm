import java.util.Scanner;

// 5 = 바구니갯수 , 4 = 공의갯수
// 예제입력 2번쨰줄 = 1 ~ 2 는 바구니고, 3 = 공의번호
// ( 초기화 핵심 )
// 1st 3 3 0 0 0
// 2nd 3 3 4 4 0
// 3th 1 1 1 1 0
// 4th 1 2 1 1 0

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] bowlArray = new int[N]; // 바구니갯수

        int M = sc.nextInt();
        for (int i = 1; i <= M; i++) {
            int I = sc.nextInt() - 1;
            int J = sc.nextInt() - 1;
            int K = sc.nextInt();

            for (int j = I; j <= J; j++) {
                bowlArray[j] = K;
            }
        }
        for (int i = 0; i < bowlArray.length; i++) {
            System.out.print(bowlArray[i] + " ");
        }
    }
}