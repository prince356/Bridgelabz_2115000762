import java.util.Scanner;

public class Level1_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int number1 = sc.nextInt();
        System.out.println("Enter Second number");
        int number2 = sc.nextInt();
        System.out.println("Enter Third number");
        int number3 = sc.nextInt();
        
        boolean flag_1=true;
        boolean flag_2=true;
        boolean flag_3=true;

        if(number1>number2 && number1>number3){
            flag_2=false;
            flag_3=false;
        }
        else if(number2>number1 && number2>number3){
            flag_1=false;
            flag_3=false;
        }
        else{
            flag_1=false;
            flag_2=false;
        }
        System.out.println("Is the first number the largest? "+flag_1);
        System.out.println("Is the second number the largest? "+flag_2);
        System.out.println("Is the third number the largest? "+flag_3);

        sc.close();

    }
}
