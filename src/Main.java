import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        fun(arr);
    }

    public static void fun(int arr[]) {
        int sum1 =0 ;
        int sum2 =0 ;
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            if(sum1>sum2){
                sum2+=arr[i];
            }
            else {
                sum1+=arr[i];
            }
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
