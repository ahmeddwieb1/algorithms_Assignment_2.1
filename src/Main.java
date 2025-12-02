import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        fun(arr);
    }

    public static void fun(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            long x = (long) Math.sqrt(arr[i]);
            if (x * x == arr[i] && isprime(x)) {
                System.out.println("YES when " + arr[i]);
            }
            else
                System.out.println("NO when " + arr[i]);
        }
    }

    public static boolean isprime(long x) {
        if (x < 2) return false;
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}