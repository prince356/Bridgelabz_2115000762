import java.util.*;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        boolean found = false;
        
        while (!found) {
            int guess = generateGuess(low, high, rand);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String response = sc.next().toLowerCase();
            
            if (response.equals("correct")) {
                System.out.println("Yay! The computer guessed your number.");
                found = true;
            } else if (response.equals("high")) {
                high = guess - 1;
            } else if (response.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        
        sc.close();
    }
    
    public static int generateGuess(int low, int high, Random rand) {
        return rand.nextInt(high - low + 1) + low;
    }
}
