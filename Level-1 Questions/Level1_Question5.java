
import java.util.Scanner;

public class Level1_Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("The person's age is "+age+ " and can vote");
        }
        else{
            System.out.println("The person's age is "+age+" and cannot vote");
        }
        sc.close();
    }
}
