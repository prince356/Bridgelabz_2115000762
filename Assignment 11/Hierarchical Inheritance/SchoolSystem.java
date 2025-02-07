class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String displayRole() {
        return "General Person";
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String displayRole() {
        return "Teacher";
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String displayRole() {
        return "Student";
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String displayRole() {
        return "Staff Member";
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        System.out.println("Role: " + teacher.displayRole());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Subject: " + teacher.getSubject());

        Student student = new Student("Bob", 16, "10th Grade");
        System.out.println("\nRole: " + student.displayRole());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());

        Staff staff = new Staff("Charlie", 40, "Administration");
        System.out.println("\nRole: " + staff.displayRole());
        System.out.println("Name: " + staff.getName());
        System.out.println("Age: " + staff.getAge());
        System.out.println("Department: " + staff.getDepartment());
    }
}
