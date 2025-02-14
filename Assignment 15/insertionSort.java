import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void insertsortemployeeid(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            int value = arr[j];
            while (j > 0  && arr[j-1] > value) {
                //swapping the values
                arr[j] = arr[j-1];
                j--;
            }
            //put the value where it belongs
            arr[j] = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size :-");
        int size = sc.nextInt();
        int[] employeeId = new int[size];
        for(int i = 0 ;i<size;i++){
            employeeId[i] = sc.nextInt();
        };
        
        System.out.println("Employee Id before sorting:- " + Arrays.toString(employeeId) );

        insertsortemployeeid(employeeId);

        System.out.println("Employee Id After sorting:- " + Arrays.toString(employeeId) );
        sc.close();
    }
}
