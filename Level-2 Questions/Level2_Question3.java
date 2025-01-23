import java.util.Scanner;

public class Level2_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Physics");
        int physics = sc.nextInt();
        System.out.println("Enter the Marks of Chemistry");
        int chemistry = sc.nextInt();
        System.out.println("Enter the marks of maths");
        int maths = sc.nextInt();
        int totalMarksScored = physics + chemistry + maths;
        int maxMarks = 300;
        double percentage = ((double) totalMarksScored / (double) maxMarks) * 100;
        System.out.println("Your Percentage is -" + percentage);
        if (percentage >= 80) {
            System.out.println("Grade A");
            System.out.println("Remark :- Level 4 , above agency-normalized standards");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Grade B");
            System.out.println("Remark :- Level 3 , at agency-normalized standards");
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("Grade C");
            System.out.println("Remark :- Level 2 ,below but approaching agency-normalized standards");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Grade D");
            System.out.println("Remark :- Level 1 , well below agency-normalized standards");
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Grade E");
            System.out.println("Remark :- Level 1- , too below agency-normalized standards");
        } else if (percentage <= 39) {
            System.out.println("Grade R");
            System.out.println("Remark :- Remedial Standards");
        }
        sc.close();
    }
}
