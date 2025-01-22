import java.util.*;
class Question9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double s1=sc.nextDouble();
		double s2=sc.nextDouble();
		double s3=sc.nextDouble();
		System.out.println("The total number of rounds the athlete will run is "+((double)5000/(s1+s2+s3))+"to complete 5 km");
	}
}