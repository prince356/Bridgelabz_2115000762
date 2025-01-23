
import java.util.Scanner;

public class Level1_Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        while(number>=41){
            System.out.println(number);
            number--;
        }
        sc.close();
    }
}
