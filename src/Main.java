import java.util.Arrays;
import java.util.Random;


public class Main {
    static Random rnd = new Random();
    public static void main(String[] args) {
        int n[] = {100, 1000, 10000, 100000, 1000000};
        for (int i = 0; i < n.length; i++) {
            int random_array[] = generate_array(n[i]);
            int array_size = random_array.length;
            int kPosition[] = {1, 10, 30, array_size / 2,  array_size - 60,  array_size - 2};

            for (int j = 0; j < kPosition.length; j++) {
                int[] arrCopy = Arrays.copyOf(random_array, array_size);
                long start = System.nanoTime();
                int result = kthSmallest(arrCopy, 0, array_size - 1, kPosition[j]);
                long end = System.nanoTime();
                System.out.println("quick selection : n=" + n[i] + " k=" + kPosition[j] +
                        " result=" + result + " time=" + ((end - start) / 1_000_000.0) + " ms");
            }

            int[] arrForMerge = Arrays.copyOf(random_array, array_size);
            long start = System.nanoTime();
            mergeSort(arrForMerge, 0, array_size - 1);
            long end = System.nanoTime();
            System.out.println("merge sort: n=" + n[i] + " time=" + ((end - start) / 1_000_000.0) + " ms");
            System.out.println("----------------------------------------------------");
        }
    }

    public static int[] generate_array(int n) {
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int random = rnd.nextInt(n) + 1;
            array[i] = random;
        }
        return array;
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int m = left + (right - left) / 2;
            mergeSort(arr, left, m);
            mergeSort(arr, m + 1, right);
            merge(arr, left, m, right);
        }
    }

    public static int partition(int[] arr, int low, int high, int pivotIndex) {
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high);
        int store = low;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                swap(arr, store, i);
                store++;
            }
        }
        swap(arr, store, high);
        return store;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int kthSmallest(int[] arr, int low, int high, int k) {
        if (k <= 0 || k > (high - low + 1)) {
            throw new IllegalArgumentException("k out of range");
        }
        while (low <= high) {
            int pivotIndex = low + rnd.nextInt(high - low + 1);
            int pivotPos = partition(arr, low, high, pivotIndex);

            int pos = pivotPos - low + 1;
            if (pos == k) {
                return arr[pivotPos];
            } else if (pos > k) {
                high = pivotPos - 1;
            } else {
                k = k - pos;
                low = pivotPos + 1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
