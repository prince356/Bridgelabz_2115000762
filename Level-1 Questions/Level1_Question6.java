import java.util.Scanner;

public class Level1_Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.err.println("Zero");
        }
        sc.close();
    }
}
