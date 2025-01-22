import java.util.*;
class Question9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int fee=sc.nextInt();
		int d=sc.nextInt();
		int disc=(double)(fee*d)/100;
		System.out.println("The discount amount is INR "+disc+" and final discounted fee is INR "+(fee-disc));
	}
}