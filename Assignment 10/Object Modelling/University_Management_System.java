import java.util.*;


//professor class
class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public void assignProfessor(Course course) {
        courses.add(course);
        course.setProfessor(this); 
        System.out.println(name + " is assigned to teach " + course.getCourseName());
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name;
    }
}

//course class
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " (Professor: " + professor.getName() + ")";
    }
}


//student class
class Student {

    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); 
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class University_Management_System {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Algorithms");

        professor1.assignProfessor(course1);
        professor2.assignProfessor(course2);

    
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

    
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        
        System.out.println("\nCourses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println(course);
        }

        System.out.println("\nCourses enrolled by " + student2.getName() + ":");
        for (Course course : student2.getCourses()) {
            System.out.println(course);
        }


        System.out.println("\nStudents in " + course1.getCourseName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student);
        }

        System.out.println("\nStudents in " + course2.getCourseName() + ":");
        for (Student student : course2.getStudents()) {
            System.out.println(student);
        }
    }
}