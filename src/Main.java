import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int y = 0;
        for (int i = 0; i <= n; i++) {
            List<Integer> list = factor(i);
            if (list.size() >= 2) {
                int dis = 1;
//                System.out.print(i +" : ");
//                for (int j = 0; j < list.size(); j++) {
//                    System.out.print(list.get(j)+" ");
//                }
//                System.out.println();
                for (int j = 0; j < list.size() - 1; j++) {
                    if (!list.get(j).equals(list.get(j + 1))) {
                        dis++;
                    }
                }
                if (dis==2){
                    y++;
                }
            }
        }
        System.out.println(y);
    }

    public static List<Integer> factor(int x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i * i <= x; i++) {
            while (x % i == 0) {
                x = x / i;
                list.add(i);
            }
        }
        if (x != 1) {
            list.add(x);
        }
        return list;
    }
}