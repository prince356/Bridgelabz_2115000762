import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void bubblesortingMarks(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    swapfunction(j-1, j, arr);
                    swap = true;
                }
            }
            if (!swap) {
                return;
            }
        }
       
    }

    public static void swapfunction(int val , int val2 , int[] arr){
        int temp = arr[val];
        arr[val] = arr[val2];
        arr[val2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size :-");
        int size = sc.nextInt();
        int[] studentsMarks = new int[size];
        for(int i = 0 ;i<size;i++){
            studentsMarks[i] = sc.nextInt();
        };

        System.out.println("The Student Marks Before Sorting:- " + Arrays.toString(studentsMarks));

        bubblesortingMarks(studentsMarks); //sorting using bubble sort
        System.out.println("The Student Marks After Sorting:- " + Arrays.toString(studentsMarks));
        sc.close();
    }
}