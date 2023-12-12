import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 1000 - sc.nextInt();
        int[] coin = {500, 100, 50, 10, 5, 1};
        int index = 0;
        int answer = 0;

        while(money != 0){
            int temp = money / coin[index];
            money = money - temp * coin[index++];

            answer = answer + temp;
        }
        System.out.println(answer);
    }
}