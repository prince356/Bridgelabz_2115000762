import java.util.*;
class Question10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int noofchocolate=sc.nextInt();
		int noofchildren=sc.nextInt();
		System.out.println(" The number of chocolates each child gets is"+(noofchocolate/noofchildren)+" and the number of remaining chocolates are"+(noofchocolate%noofchildren));
	}
}