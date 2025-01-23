import java.util.Scanner;

public class Level2_Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight ");
        double weight = sc.nextDouble();
        System.out.println("Enter Your Height ");
        double height = sc.nextDouble()/100;
        double BMI = weight / (height * height);
        System.out.println("Your corresponding BMI is " + BMI );
        System.out.println(BMI);
        if(BMI <= 18.4){
            System.out.println("status : - UnderWeight");
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Status : - Normal");
        }
        else if (BMI >= 25.0 && BMI <= 39.9) {
            System.out.println("Status : - OverWeight");
        }
        else if (BMI >= 40.0) {
            System.out.println("Status : - Obese");
        }
        sc.close();
    }
}
