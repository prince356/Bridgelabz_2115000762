import java.util.*;
class Question10{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double hincm=sc.nextDouble();
		double hininches=(double)hincm/2.54;
		System.out.println("Your Height in cm is "+hincm+" while in feet is "+(double)hininches/12+" and inches is "+hininches);
	}
}