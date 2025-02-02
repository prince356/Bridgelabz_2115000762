class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String researchArea;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchArea) {
        super(rollNumber, name, CGPA);
        this.researchArea = researchArea;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Research Area: " + researchArea);
    }
    
    public static void main(String[] args) {
        Student student1 = new Student(101, "John Doe", 3.8);
        student1.displayDetails();
        System.out.println();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Jane Smith", 3.9, "Machine Learning");
        pgStudent.displayPostgraduateDetails();
    }
}
