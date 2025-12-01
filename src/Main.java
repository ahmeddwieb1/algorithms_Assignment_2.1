import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextLong();
            arr[i] = i + 1;
        }
        fun(arr);
//        System.out.println(isprime(11881));
    }

    public static void fun(long[] arr) {
        for (int i = 0; i < arr.length; i++) {

                if ((isprime(Math.sqrt(arr[i])))) {
                    System.out.println("YES when "+ arr[i]);
                }

            HashSet x = fun1(arr[i]);
            if (x.size() == 3)
                System.out.println("YES when "+ arr[i]);
            else
                System.out.println("NO when "+ arr[i]);
        }
    }

    public static HashSet fun1(long n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
            }
        }
        return set;
    }

    public static boolean isprime(double x) {
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