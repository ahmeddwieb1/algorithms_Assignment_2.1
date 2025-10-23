public class Main {
    public static void main(String[] args) {

//        n = 100000000 ,75000000 ,50000000 ,20000000 ,10000000
        int n[] = {10000000, 50000000, 100000000};
        int time[] = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            int array[] = generate_array(n[i]);
            System.out.println("when array size =" + n[i]);

            long start = System.currentTimeMillis();
            System.out.println("start: " + start);

            System.out.println(linear_search(array, -1));

            long end = System.currentTimeMillis();
            System.out.println("end: " + end);
            System.out.println("all operation: " + (end - start) + "ms");
            time[i] = (int) (end - start);
            System.out.println();
        }
//        cal the avg
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < time.length; i++) {
            sum += time[i];
            avg = (double) sum / time.length;
        }
        System.out.println("avg: " + avg);
    }

    public static int[] generate_array(int n) {
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * n + 1);
            array[i] = random;
        }
        return array;
    }

    public static int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}