import java.util.*;
class Question16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int noofstudents=sc.nextInt();
		System.out.println("Possible no. of handshakes "+(double)(noofstudents*(noofstudents-1))/2);
	}
}