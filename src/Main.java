import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Job> jobs = new PriorityQueue<>(
                (a, b) -> b.profit - a.profit
        );
        boolean done = true;

        while (done) {
            System.out.println("1- Add Job");
            System.out.println("2- Quit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Job ID: ");
                    String id = sc.next();

                    System.out.print("Enter Deadline: ");
                    int dl = sc.nextInt();

                    System.out.print("Enter Profit: ");
                    int profit = sc.nextInt();

                    jobs.add(new Job(id, dl, profit));
                    System.out.println("Job Added!\n");
                    break;

                case 2:
                    done = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        }

        max_profit(jobs);
    }

    public static void max_profit(PriorityQueue<Job> jobs) {
        int count = 0;
        int sum = 0;
//can replace jobs.size with max DL it will work best but code wiil be more complex and
// it will take more time to find the max DL and could be not effected like in ex1 the max is 4 and the output is 2
        String array[] = new String[jobs.size()];
        while (!jobs.isEmpty()) {
            Job job = jobs.poll();
            if (job.DL > count) {
                sum += job.profit;
                array[count] = job.id;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(sum);
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