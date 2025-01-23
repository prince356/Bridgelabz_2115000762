import java.util.Scanner;

public class Level2_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int number = sc.nextInt();
        if(number == 1 || number == 2){
            System.out.printf("The number %d is Prime" , number);
        }
        boolean isPrime = true;
        for(int i = 2 ; i< number ;i++){
            if (number % i == 0) isPrime = false;
        }

        if (isPrime) {
                    System.out.printf("The number %d is Prime " , number);
        }
        else{
            System.out.printf("The number %d is Not Prime" , number);
        }
        sc.close();

        
    }
}
