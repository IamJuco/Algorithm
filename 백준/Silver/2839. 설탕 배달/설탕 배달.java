import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sugar = 0;

        while(true) {
            if (N % 5 > 0) {
                N = N - 3;
                sugar++;
                if (N == 0) {
                    break;
                }
                else if (N - 3 < 0){
                    sugar = -1;
                    break;
                }
            } else if (N % 5 == 0) {
                sugar = sugar + N / 5;
                break;
            }
        }
        System.out.println(sugar);
    }
}