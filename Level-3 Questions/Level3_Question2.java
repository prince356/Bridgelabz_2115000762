import java.util.Scanner;

public class Level3_Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int count = 0;
        while (number > 0 ) {
            number /= 10;
            count++;
        }
        System.out.println("The number of Digits are " + count);
        sc.close();
    }
}
