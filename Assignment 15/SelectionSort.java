import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] examScores = {20,23,32,19,18,8,13,2,14,4,1};
        System.out.println("Marks Before Sorting :- " + Arrays.toString(examScores));
        sort(examScores);
        System.out.println("Marks after Sorting :- " + Arrays.toString(examScores));
    }
}
