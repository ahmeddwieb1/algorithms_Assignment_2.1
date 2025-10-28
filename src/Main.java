import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeA = sc.nextInt();
        int sizeB = sc.nextInt();

        int A[] = new int[sizeA];
        int B[] = new int[sizeB];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for (int i = 0; i < B.length; i++) {
            System.out.println(binarysearch(A, B[i]) + " ");
        }
    }

    public static int binarysearch(int[] arr, int key) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key) {
                right = mid ;
            } else if (arr[mid] < key) {
                left = mid + 1;
            }else
                return mid+1;
        }
        return -1;
    }

}