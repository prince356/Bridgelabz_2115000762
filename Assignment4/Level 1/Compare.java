import java.util.*;
public class Compare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int [] numbers = new int[5];
        for(int i=0; i < numbers.length ;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < numbers.length ;i++){
           if(numbers[i] > 0){
                if(numbers[i] % 2 ==0){
                    System.out.println(numbers[i] + " is even");
                }
                else{
                    System.out.println(numbers[i] + " is odd");
                }
           }
           else if(numbers[i] < 0){
                System.out.println(numbers[i] + " is negative");
           }
           else{
                System.out.println("zero");
           }
        }

        if(numbers[0] > numbers [numbers.length-1]){
            System.out.println("first number is greater last number");
        }
        else if(numbers[0] < numbers [numbers.length-1]){
            System.out.println("first number is smaller last number");
        }
        else{
            System.out.println("first number is equal to last number");
        }
    }
}