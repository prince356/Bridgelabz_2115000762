import java.util.Scanner;
public class Level1_Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; 
        double userInput;  
        System.out.println("Enter numbers to sum. Enter 0 to stop.");
        while (true) {
            System.out.print("Enter a number: ");
            userInput = sc.nextDouble();
            if (userInput == 0) {
                break;
            }
            total += userInput; 
        }
        System.out.println("The total sum is: " + total);
        sc.close(); 

    }

}
