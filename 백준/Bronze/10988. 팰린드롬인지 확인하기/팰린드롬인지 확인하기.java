import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String reverse = "";
        for (int i = T.length()-1; i >= 0 ; i--) {
            reverse = reverse + T.charAt(i);
        }
        if(reverse.equals(T)){
            System.out.println(1);
        }else System.out.println(0);
    }
}