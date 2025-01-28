import java.util.Scanner;

public class Level3_Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        String[] months = {
                "January", "February", "March", "April", "May", "June", 
                "July", "August", "September", "October", "November", "December"
        };

        String[] daysOfWeek = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};

        int numDays = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("     " + months[month - 1] + " " + year);
        for (String day : daysOfWeek) {
            System.out.print(day + " ");
        }
        System.out.println();

        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }


        for (int i = 1; i <= numDays; i++) {
            System.out.printf("%3d ", i);

            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }
}
