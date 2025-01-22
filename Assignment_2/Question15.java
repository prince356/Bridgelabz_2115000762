import java.util.*;
class Question15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double quantity=sc.nextDouble();
		double up=sc.nextDouble();
		System.out.println("The total purchase price is INR"+(up*quantity)+" if the quantity"+quantity+" and unit price is INR" +up);
	}
}