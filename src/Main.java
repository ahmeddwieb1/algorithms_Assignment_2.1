import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fun(n);
    }

    public static void fun(int a) {

        System.out.print(a + " ");
        if (a == 1) {
            return;
        }
        if (a % 2 == 0) {
            fun(a / 2);
        } else {
            fun((a * 3) + 1);
        }
    }
}
