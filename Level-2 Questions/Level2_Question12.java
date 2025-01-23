import java.util.Scanner;

public class Level2_Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number it Less than 100");
        int number = sc.nextInt();
        for (int i = 100; i >=1 ; i--) {
            if(number % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
