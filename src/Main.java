import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isprime(n)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static boolean isprime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}