import java.util.Scanner;

public class Level3_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int originalNumber  = number;
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, 3);
            number /= 10;
        }
        if (originalNumber == sum) {
            System.out.printf("The number %d is an Armstrong number" , originalNumber);
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }

        sc.close();
    }   
}
