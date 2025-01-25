import java.util.*;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] frequency = new int[10];
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        System.out.println("Frequency of each digit in the number " + number + ":");
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
