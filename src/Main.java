import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int pattern[] = {6, 8, 4, 2};
        int  index = n % 4;
        System.out.println(pattern[index]);
    }
}