import java.util.*;
public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []  multiplicationResult= new int[10];
        int number = 0;
        boolean flag =false;
        while(flag == false){
             if(number >= 6 && number <=9){
                flag= true;
               break;
            }
            System.out.println("Enter a number between 6 and 9");
            number = sc.nextInt();
        }
        for(int i= 0 ; i <multiplicationResult.length ; i++){
            multiplicationResult[i] = number * (i+1);
        }

        for(int i=0; i < multiplicationResult.length ;i++){
            System.out.println(number+ " * "+(i+1) + " = "+ number*(i+1));
        }
       
    }
}