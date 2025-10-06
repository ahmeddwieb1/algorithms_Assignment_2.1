import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int res = 1;
            for (long i = n; i > 0; i--) {
                res *= 8;
            }
            System.out.println(res%10);
    }
}