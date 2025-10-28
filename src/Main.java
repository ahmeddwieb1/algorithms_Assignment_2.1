import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> serega = new ArrayList<>(Collections.nCopies((size / 2) + 1, 0));
        List<Integer> dima = new ArrayList<>(Collections.nCopies(size / 2, 0));
        while (!list.isEmpty()) {
            char choose = choose_round(serega, dima, 0);
            int max = choose_Max(list, list.size() - 1);
            switch (choose) {
                case 's':
                    int i = firstZeroIndex(serega);
                    serega.set(i, max);
                    if (max == list.get(list.size() - 1)) {
                        list.remove(list.size() - 1);
                    } else {
                        list.remove(0);
                    }
                    break;
                case 'd':
                    int x = firstZeroIndex(dima);
                    dima.set(x, max);
                    if (max == list.get(list.size() - 1)) {
                        list.remove(list.size() - 1);
                    } else
                        list.remove(0);
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < serega.size(); i++) {
            sum += serega.get(i);
        }
        System.out.print(sum + " ");
        sum = 0;
        for (int i = 0; i < dima.size(); i++) {
            sum += dima.get(i);
        }
        System.out.print(sum);
    }

    public static char choose_round(List<Integer> ser, List<Integer> dima, int i) {
        if (ser.get(i) == 0) {
            return 's';
        }
        if (dima.get(i) == 0) {
            return 'd';
        }
        return choose_round(ser, dima, i + 1);
    }

    public static int choose_Max(List<Integer> list, int lastIndex) {
        if (list.get(0) > list.get(lastIndex)) {
            return list.get(0);
        }
        return list.get(lastIndex);
    }

    public static int firstZeroIndex(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) return i;
        }
        return -1;
    }
}