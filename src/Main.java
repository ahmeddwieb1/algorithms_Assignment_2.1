import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            int x = factorial(b) / factorial(a);
            System.out.println(x % 10);
        }else {
            int y = factorial(a) / factorial(b);
            System.out.println(y % 10);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}