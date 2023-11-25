import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int m = 60 * A + B;
        m += C;

        int hour = (m / 60) % 24;
        int minute = m % 60;

        System.out.println(hour + " " + minute);
    }
}