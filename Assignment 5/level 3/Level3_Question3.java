
public class Level3_Question3 {

    public static void main(String[] args) {
        int number = 21;

        int[] digits = storeDigits(number);
        
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Harshad number: " + isHarshadNumber(digits, number));
        
        int[][] frequency = findFrequencyOfDigits(digits);
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
        }
    }

    public static int countDigits(int number) {
        return (int) Math.log10(number) + 1;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] findFrequencyOfDigits(int[] digits) {
        int[][] frequency = new int[10][2]; 
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][0] = digits[i]; 
            frequency[digits[i]][1]++; 
        }
        return frequency;
    }
}
