import java.util.Scanner;

public class Main {

    // 맨 처음 딸기 우유
    // 딸기우유 후에 초코우유
    // 초코우유 후에 바나나 우유
    // 바나나 우유 후에 딸기우유

    // 한번 지나친 우유가게에는 다시 갈수 없다.
    // 0 = 딸기
    // 1 = 초코
    // 2 = 바나나
    
    // 우유 가게는 0 1 2만 존대

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
           arr[i] = sc.nextInt();
        }

        int milk = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == milk){
                count++;
                milk++;
                if (milk == 3){
                    milk = 0;
                }
            }
        }
        System.out.println(count);
    }
}