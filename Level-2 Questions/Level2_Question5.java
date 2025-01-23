import java.util.Scanner;

public class Level2_Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <=number; i++) {
            if (i % 3 == 0) {
                if (i % 5 ==0) {
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        sc.close();
    }

}
