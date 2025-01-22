import java.util.*;
class Question3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextDouble();
		int b=sc.nextDouble();
		int c=sc.nextDouble();
		System.out.println("The results of Int Operations are"+(a + b *c) +","+(a * b + c)+","+(c + a / b)+"and "+(a % b + c));
	}
}