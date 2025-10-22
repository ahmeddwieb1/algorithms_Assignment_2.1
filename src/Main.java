import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = n;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            while (x % i == 0) {
                x = x / i;
                list.add(i);
            }
        }
        if (x != 1) {
            list.add(x);
        }
        if (list.size() < k) {
            System.out.println(-1);
            return;
        }
        int ans = 1;
        for (int i = k -1; i < list.size(); i++) {
            int number = list.get(i);
            ans *= number;
//            list.remove(i);
        }
        list.add(k-1,ans);

        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i) +" ");
        }
    }
}