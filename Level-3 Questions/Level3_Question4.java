import java.util.Scanner;

public class Level3_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum = sum + i;
            }
        }
        if(sum > number){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }
        sc.close();
    }
}
