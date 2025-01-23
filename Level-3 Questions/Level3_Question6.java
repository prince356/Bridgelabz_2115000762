import java.util.Scanner;

public class Level3_Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the first Number");
            double first = sc.nextDouble();
            System.out.println("Enter the second Number");
            double second = sc.nextDouble();
            System.out.println("Enter the operation includes [ + , - , * , /]");
            String op = sc.next();
            System.out.println(switchoperation(first, second, op));
        }
        sc.close();

    }

    public static double switchoperation(double first, double second, String op) {
        switch (op) {
            case "+":
                return first + second;
            case "-":
                return first + second;
            case "*":
                return first + second;
            case "/":
                return first + second;
            default:
                System.out.println("Invalid Operator");
                return 0.0;
        }
    }
}
