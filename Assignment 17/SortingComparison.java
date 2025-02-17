import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] leftArr = new int[n1], rightArr = new int[n2];
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            arr[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static long measureTime(Runnable method) {
        long start = System.nanoTime();
        method.run();
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        int[] sizes = {1_000, 10_000, 1_000_000};
        Random random = new Random();

        for (int size : sizes) {
            int[] original = new int[size];
            for (int i = 0; i < size; i++) {
                original[i] = random.nextInt(size * 10);
            }

            if (size <= 10_000) {
                int[] bubbleArray = Arrays.copyOf(original, original.length);
                long bubbleTime = measureTime(() -> bubbleSort(bubbleArray));
                System.out.printf("Dataset Size: %,d | Bubble Sort: %,d ns%n", size, bubbleTime);
            } else {
                System.out.printf("Dataset Size: %,d | Bubble Sort: Unfeasible%n", size);
            }

            int[] mergeArray = Arrays.copyOf(original, original.length);
            long mergeTime = measureTime(() -> mergeSort(mergeArray, 0, mergeArray.length - 1));

            int[] quickArray = Arrays.copyOf(original, original.length);
            long quickTime = measureTime(() -> quickSort(quickArray, 0, quickArray.length - 1));

            System.out.printf("Dataset Size: %,d | Merge Sort: %,d ns | Quick Sort: %,d ns%n",
                    size, mergeTime, quickTime);
        }
    }
}
