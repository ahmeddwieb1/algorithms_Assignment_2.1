import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int temp = target - array[i];
            int x = linear_search(array, temp);
            if (x != -1) {
                System.out.print("n: "+array[i]+":"+(i+1) + " " + "target :"+temp +" :"+ (x+1));
                break;
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    public static int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}