import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Job> jobs = new PriorityQueue<>(
                (a, b) -> b.profit - a.profit
        );
        jobs.add(new Job("A", 2, 100));
        jobs.add(new Job("B", 1, 19));
        jobs.add(new Job("C", 2, 27));
        jobs.add(new Job("D", 1, 25));
        jobs.add(new Job("E", 3, 15));
        int count = 0;
        int sum = 0;
        String array[] = new String[3];
        while (!jobs.isEmpty()) {
            Job job = jobs.poll();
            if (job.DL > count) {
                sum += job.profit;
                array[count] = job.id;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
        System.out.print(sum);
    }
}

class Job {
    int profit;
    int DL;
    String id;

    Job(String id, int DL, int profit) {
        this.id = id;
        this.DL = DL;
        this.profit = profit;
    }
}