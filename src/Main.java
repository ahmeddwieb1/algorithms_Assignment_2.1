import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(power(num, power));
    }

    public static int power(int num, int pow) {
        if (num == 0) {
            return 1;
        } else if(pow %2== 0) {
            int temp = (int) Math.pow(num,pow/2);
            return temp*temp;
        }
        else {
            int temp = (int) Math.pow(num,(pow-1)/2);
            return temp*temp*num;
        }
    }
}