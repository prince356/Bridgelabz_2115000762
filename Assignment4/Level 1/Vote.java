import java.util.*;
public class Vote{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Students = sc.nextInt();
        int [] age = new int[Students];
        for(int i=0; i < Students ;i++){
            age[i] = sc.nextInt();
        }

        for(int i = 0; i < age.length ;i++){
            if(age[i] < 0){
                System.out.println("invalid age");
            }
            else if(age[i] >= 18){
                System.out.println("The student with the age "+age[i] + " can vote.");
            }
            else{
                System.out.println("The student with the age "+age[i] + " cannot vote.");
            }
        }
    }
}