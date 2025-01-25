import java.util.*;
public class StoreValues{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double [] store = new double[10];
        int index =0;
        double total =0;
        while(true){
            double val = sc.nextDouble();
            if(val <= 0 || index ==10){
                break;
            }
            store[index++] = val;
        }
        for(int i=0 ; i < store.length ; i++){
            total += store[i];
        }
        System.out.println("Total: " + total);
    }
}