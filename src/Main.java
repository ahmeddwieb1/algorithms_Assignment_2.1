import java.util.Scanner;

public class Main {
    static int mod = 1000000007;

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return ((a % mod) + (b % mod) + mod) % mod;
    }
    public static int sub(int a, int b) {
        return ((a % mod) - (b % mod) + mod) % mod;
    }
    public static int mul(int a, int b) {
        return ((a % mod) * (b % mod)) % mod;
    }


}
