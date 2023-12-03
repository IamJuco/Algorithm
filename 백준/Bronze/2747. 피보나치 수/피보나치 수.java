import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp1 = 0;
        int temp2 = 1;
        int fn = 0;

        if(n == 0){
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= n; i++) {
                fn = temp1 + temp2;
                temp1 = temp2;
                temp2 = fn;
            }
            System.out.println(fn);
        }
    }
}