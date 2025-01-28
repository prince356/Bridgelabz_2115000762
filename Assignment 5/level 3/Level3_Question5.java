public class Level3_Question5 {

    public static void main(String[] args) {
        int number = 37;

        System.out.println("Number: " + number);
        System.out.println("Prime number: " + isPrime(number));
        System.out.println("Neon number: " + isNeon(number));
        System.out.println("Spy number: " + isSpy(number));
        System.out.println("Automorphic number: " + isAutomorphic(number));
        System.out.println("Buzz number: " + isBuzz(number));
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return (square % Math.pow(10, countDigits(number))) == number;
    }

    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    public static int countDigits(int number) {
        return (int) Math.log10(number) + 1;
    }
}
