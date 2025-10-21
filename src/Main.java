import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 1024;
        int k = 5;
        int array[] = new int[k];
        // find i
        //breack when k-1 !=0
        for (int x = 2; x * x < n; x++) {//بيعد ال factors
            for (int i = 0; i < k; ) {//بيعد لل array
            if (array[k - 2] != 0) {
                    array[k-1] = n;
                    break;
                }
                while (n % x == 0 && array[k - 2] == 0) {
                    array[i] = x;
                    n /= x;
                    i++;
                }

            }
        }

        for (int x = 0; x < k; x++) {
            System.out.print(array[x] + " ");
        }

    }
}