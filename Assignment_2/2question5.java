import java.util.*;
class Question5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		System.out.println("The "+f+" fahrenheit is "+(double)((f-32)*5)/9+"celsius");
	}
}