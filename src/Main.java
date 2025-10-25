import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(factorial(Math.min(q, p)));
    }
    public static int factorial(int x) {
        if (x == 0) return 1;
        return x * factorial(x - 1);
    }
}