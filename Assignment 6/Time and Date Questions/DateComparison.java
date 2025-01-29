import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first date (YYYY-MM-DD):");
        String inputDate1 = sc.nextLine();
        System.out.println("Enter the second date (YYYY-MM-DD):");
        String inputDate2 = sc.nextLine();
        
        
        LocalDate date1 = LocalDate.parse(inputDate1);
        LocalDate date2 = LocalDate.parse(inputDate2);
        
        
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
        
        sc.close();
    }
}
