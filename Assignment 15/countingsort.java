import java.util.Arrays;
import java.util.Scanner;

public class countingsort {

    public static int[] countSort(int[] arr){
        //first find the max element in array
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max , arr[i]);
        }

        int[] countarray = new int[max+1];
        //frequency array value adding
        for (int i = 0; i < arr.length; i++) {
            countarray[arr[i]]++;
        }

        //prefix sum 
        for (int i = 1; i <= max; i++) {
            countarray[i] += countarray[i-1];
        }

        //output array creation 
        int[] output = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            output[countarray[arr[i]]-1] = arr[i];
            countarray[arr[i]]--;
        }

        return output;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] studentAges = new int[size];
        System.out.println("Enter the students ages between 10 - 18");
        for (int i = 0; i < studentAges.length; i++) {
            studentAges[i] = sc.nextInt();
        }
        

        System.out.println("Student ages Before Sorting:- " + Arrays.toString(studentAges));

        System.out.println("Student ages After Sorting:- " + Arrays.toString(countSort(studentAges)));
        sc.close();
    }
}
