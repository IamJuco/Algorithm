import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int temp = 0;
        int result = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if(result < temp && temp <= M){
                        result = temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
}