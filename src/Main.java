import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        double[] arr = {72, 96, 12, 18, 81, 20, 6, 2, 54, 1};
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
            while (arr[i] % 3 == 0) {
                arr[i] /= 3;
            }
            if (arr[i] != arr[0]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}