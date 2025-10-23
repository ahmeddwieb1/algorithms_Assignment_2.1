import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        n = 100000000 ,75000000 ,50000000 ,20000000 ,10000000
        int n = 10000000;
        long start = System.currentTimeMillis();
        System.out.println("start: " + start);
        int array[] = generate_array(n);
        long end = System.currentTimeMillis();
        System.out.println("end: " + end);
        System.out.println("all operation2: " + (end - start) + "ms");
        for (int i = 0; i < 15; i++) {
            System.out.println(array[i]);
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