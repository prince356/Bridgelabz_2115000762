import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found
            }
        }
        return -1; // Target not found
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Target not found
    }

    // Function to measure execution time
    public static long measureTime(Runnable method) {
        long start = System.nanoTime();
        method.run();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10_000, 1_000_000};
        Random random = new Random();

        for (int size : sizes) {
            int[] dataset = new int[size];
            for (int i = 0; i < size; i++) {
                dataset[i] = random.nextInt(size * 10); // Random data
            }

            int target = dataset[random.nextInt(size)]; // Choose a random target
            long linearTime = measureTime(() -> linearSearch(dataset, target));

            Arrays.sort(dataset); // Sorting required for binary search
            long binaryTime = measureTime(() -> binarySearch(dataset, target));

            System.out.printf("Dataset Size: %,d | Linear Search: %,d ns | Binary Search: %,d ns%n",
                    size, linearTime, binaryTime);
        }
    }
}
