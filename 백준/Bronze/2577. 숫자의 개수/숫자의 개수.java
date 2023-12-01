import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int arr[] = new int[10];
        int num = A * B * C;

        String S = String.valueOf(num);
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if(S.charAt(i) - '0' == j){
                    ++arr[j];
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}