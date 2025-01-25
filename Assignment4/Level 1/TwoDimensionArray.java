import java.util.*;
public class TwoDimensionArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        System.out.println("Enter column: ");
        int column = sc.nextInt();
        int[][] TwoDArray = new int[row][column];
        for(int i =0 ; i < row ; i++){
            for(int j =0 ; j < column ; j++){
                TwoDArray[i][j] = sc.nextInt();
            }
        }
        int [] OneDArray = new int[row*column];
        int index =0;

        for(int i =0 ; i < row ; i++){
            for(int j =0 ; j < column ; j++){
                OneDArray[index++] = TwoDArray[i][j];
            }
        }

        for(int i : OneDArray){
            System.out.print(i + " ");
        }
    }
}