import java.util.Scanner;

public class Main {

    // 102호는 거리 2만큼 걸어야하지만 301호는 거리 1만큼 걸어야해서 더 선호
    // 102호보다 2101호를 더 선호
    // 첫번째 손님 101호, 두번째손님은 201호에 배정해야함
    // 즉, 층수가 10층이면 11번째 손님은 102호에 배정해야함

    // T 개의 테스트
    // H = 6 ( 층 )
    // W = 12 ( 방 갯수 )
    // N = 10 ( N번째 손님 )


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); // 층
            int W = sc.nextInt(); // 방 갯수 ( 호실 )
            int N = sc.nextInt(); // N 번째 손님
            
            // 6층 이고 6명일때
            if (N % H == 0) {
                // 호수를 정해준다. ( 층 * 100 ) + 1
                System.out.println((H * 100) + (N / H));

            } else {
                // 6층일때 7명이면, ( 100 + ( 2 ) )
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}