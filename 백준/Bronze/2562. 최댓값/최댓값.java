import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        int n = 9;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}