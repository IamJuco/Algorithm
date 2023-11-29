import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            arr[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}