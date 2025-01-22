import java.util.*;
class Question11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double principle=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		System.out.println("The Simple Interest is "+(double)(principle*rate*time)/100+" for Principal "+principle+", Rate of Interest "+rate+" and Time"+time);
	}
}