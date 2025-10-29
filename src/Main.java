import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfshops = sc.nextInt();
        int prices[] = new int[numOfshops];

        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int numOfdays = sc.nextInt();
        int Days[] = new int[numOfdays];
        for (int i = 0; i < Days.length; i++) {
            Days[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        for (int i = 0; i < Days.length; i++) {
            System.out.println(upperBound(prices, Days[i]));
        }

    }

    public static int upperBound(int[] arr, int value) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}