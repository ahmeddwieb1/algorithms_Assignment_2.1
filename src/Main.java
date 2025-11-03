import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(power(num, power));
    }
    public static int power(int num , int pow){
        int sum = 1;
        for (int i = 0; i < pow; i++) {
            sum*=num;
        }
        return sum;
    }
    
}