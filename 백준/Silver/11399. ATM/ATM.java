import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        // 1 2 3 4 5
        int sumTotal = 0; // 누적
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum = sum + a[i];
            sumTotal = sumTotal + sum;
        }
        System.out.println(sumTotal);
    }
}