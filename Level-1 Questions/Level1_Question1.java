import java.util.Scanner;

public class Level1_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? true");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? false");
        }

        sc.close();
    }
}
