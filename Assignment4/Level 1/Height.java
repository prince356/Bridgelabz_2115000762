import java.util.*;
public class Height{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        double[] height = new double[11];
        double sum =0;
        for(int i =0 ; i < height.length ; i++){
            height[i] = sc.nextDouble();
            sum += height[i];
        }
        double meanHeight = sum / height.length;
        System.out.println("Mean Height is "+ meanHeight);
    }
}