import java.util.Scanner;

public class Level3_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0 ;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }


        sc.close();
    }    
}
