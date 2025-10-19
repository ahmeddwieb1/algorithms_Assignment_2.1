import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 14 ;
        int x = n;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i*i <= n; i++) {

            while (x % i == 0) {
                x = x / i;
                list.add(i);
            }
        }
        if (x!=1){
            list.add(x);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}