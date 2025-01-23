import java.util.Scanner;

public class Level2_Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
