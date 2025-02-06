import java.util.*;

//University class
class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        department.setUniversity(this);
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public void printDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println(department);
        }
        System.out.println("Faculty members:");
        for (Faculty faculty : faculties) {
            System.out.println(faculty);
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);
        for (Department dept : departments) {
            System.out.println("Deleting Department: " + dept.getName());
        }
        departments.clear();
    }
}

//department class
 class Department {
    private String name;
    private University university; 

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Department: " + name;
    }
}


// faculty class
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

public class University_management {
    public static void main(String[] args) {

        University university = new University("GLA University");

        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        Faculty faculty1 = new Faculty("Dr Mayank");
        Faculty faculty2 = new Faculty("Dr.Deepti");

        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        university.printDetails();
        university.deleteUniversity();
        university.printDetails();
    }
}