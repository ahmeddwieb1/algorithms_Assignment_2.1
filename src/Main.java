import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //factorization
        int  n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if (n%i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i =1; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                System.out.print(i+","+(n/i));
                System.out.println();
            }
        }


    }
}