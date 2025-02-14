import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void sort(int[] arr , int low , int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }


    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);  
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array"    );
        int size = sc.nextInt();
        int[] ProductPrices = new int[size];
        for (int i = 0; i < size; i++) {
            ProductPrices[i] = sc.nextInt();
        }

        System.out.println("Prices before Sorting :- " + Arrays.toString(ProductPrices));

        sort(ProductPrices , 0 , size-1);

        System.out.println("Prices After Sorting :- " + Arrays.toString(ProductPrices));

        sc.close();
    }
}
