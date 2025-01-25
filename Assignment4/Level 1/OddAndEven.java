import java.util.*;
public class OddAndEven{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 1){
            System.out.println("Error");
            System.exit(0);
        }
        int []  odd= new int[number/2+1];
        int oddIndex =0;
        int []  even= new int[number/2+1];
        int evenIndex =0;
        for(int i=1 ; i <= number; i++){
            if(i % 2==0){
                even[evenIndex++] = i;
            }
            else{
                odd[oddIndex++] = i;
            }
        }
        System.out.println("Odd numbers: ");
        for(int i=0 ; i < odd.length; i++){
            System.out.println(odd[i]);
        }
        System.out.println("Even numbers: ");
        for(int i=0 ; i < even.length; i++){
            System.out.println(even[i]);
        }
    }
}