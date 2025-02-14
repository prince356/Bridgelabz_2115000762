import java.util.Arrays;

public class MergeSort {
    
    // Method to sort the array using Merge Sort
    public static void mergeSort(double[] prices) {
        if (prices.length < 2) {
            return; 
        }
        
        int mid = prices.length / 2; 
        double[] left = Arrays.copyOfRange(prices, 0, mid); 
        double[] right = Arrays.copyOfRange(prices, mid, prices.length);
        
        mergeSort(left);
        mergeSort(right); 
        
        merge(prices, left, right); 
    }
    
    private static void merge(double[] prices, double[] left, double[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                prices[k++] = left[i++]; // Add from left if smaller or equal
            } else {
                prices[k++] = right[j++]; // Add from right if smaller
            }
        }
        
        while (i < left.length) {
            prices[k++] = left[i++];
        }
        
        while (j < right.length) {
            prices[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        double[] prices = {29.99, 9.99, 19.99, 5.99, 14.99};
        
        System.out.println("prices before Sorting: "  +Arrays.toString(prices));
        
        mergeSort(prices); 
        
        System.out.println("Prices after sorting : " + Arrays.toString(prices));
    }
}
