import java.util.Scanner;

public class Level2_Question10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the Power");
        int power = sc.nextInt();
        int resultPower = 1;
        for (int i = 1; i <=power ; i++) {
            resultPower *=number;
        }
        System.out.println("The Power is " + resultPower);
        sc.close();
    }
}
