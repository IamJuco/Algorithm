import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 245의 분해합 = 256 (245 + 2 + 4 + 5)
        for (int i = 1; i <= N; i++) {
            int sum = i; // 분해합을 저장해야하고 1 ~ 256
            int temp = i; // 잠깐 저장해둠
            while(temp != 0){
                sum += temp % 10; // 1의 자리
                temp = temp / 10; // 몫을 저장해줬어
            }
            if(sum == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }
}