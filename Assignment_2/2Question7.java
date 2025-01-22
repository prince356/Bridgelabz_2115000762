import java.util.*;
class Question7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("The swapped numbers are "+num1+" and "+num2);
	}
}