import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a date in YYYY-MM-DD format:");
        String inputDate = sc.nextLine();
        
        LocalDate date = LocalDate.parse(inputDate);
        
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);
        
        result = result.minusWeeks(3);
        
        System.out.println("Resulting date after adding and subtracting: " + result);
        
        sc.close();
    }
}
