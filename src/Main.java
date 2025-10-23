import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        n = 100000000 ,75000000 ,50000000 ,20000000 ,10000000
        int n[] ={ 10000000,50000000,100000000 };
        for (int i = 0; i < n.length; i++) {
            System.out.println("when array size ="+n[i]);
            long start = System.currentTimeMillis();
            System.out.println("start: " + start);
            generate_array(n[i]);
            long end = System.currentTimeMillis();
            System.out.println("end: " + end);
            System.out.println("all operation: " + (end - start) + "ms");
        }
    }

    public static int[] generate_array(int n) {
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * n + 1);
            array[i] = random;
        }
        return array;
    }
}