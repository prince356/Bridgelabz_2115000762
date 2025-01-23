
import java.util.Scanner;

public class Level1_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number<0){
            System.out.println("The number "+number+" is not a natural number");
        }
        else{
            int sum =  number * (number+1) / 2 ;
            System.out.println("The sum of "+number+" natural numbers is "+sum);
        }
    }
}
