
public class Student {

    static String universityName = "GLA UNIVERSITY";
    private String name;
    private final int rollNumber;
    private char grade;

    static int totalStudents = 0;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) { 
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to: " + grade);
        }
    }

    public static void main(String[] args) {
        Student st = new Student("Krishna", 34, 'A');
        Student st1 = new Student("Kunal", 65, 'C');
        st.displayDetails();
        st.updateGrade('B');
        st.displayDetails();
        st1.displayDetails();
        Student.displayTotalStudents();
        
    }
}
