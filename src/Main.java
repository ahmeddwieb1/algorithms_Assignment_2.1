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
        for (int i = 0; i < B.length; i++) {
            int num = 0;
            for (int j = 0; j < A.length; j++) {
                if (B[i] >= A[j]) {
                    num++;
                }
            }
            System.out.print(num+" ");
        }
    }
}