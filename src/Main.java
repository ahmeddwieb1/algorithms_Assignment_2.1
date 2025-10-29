import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_of_piles = sc.nextInt();
        int worms[] = new int[num_of_piles];
        for (int i = 0; i < worms.length; i++) {
            worms[i] = sc.nextInt();
        }

        int number_of_juicy_worms = sc.nextInt();
        int labels[] = new int[number_of_juicy_worms];
        for (int i = 0; i < labels.length; i++) {
            labels[i] = sc.nextInt();
        }
        for (int i = 1; i < worms.length; i++) {
            worms[i] += worms[i - 1];
        }
        for (int i = 0; i < number_of_juicy_worms; i++) {
            System.out.println(lowerBound(worms, labels[i]));
        }
    }

    public static int lowerBound(int[] arr, int value) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left + 1;
    }

}