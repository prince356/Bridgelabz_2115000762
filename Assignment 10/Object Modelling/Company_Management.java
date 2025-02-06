import java.util.*;

//employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//company class
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDetails();
        }
    }

    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear();
    }
}

class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (Employee employee : employees) {
            System.out.println("    Employee: " + employee.getName());
        }
    }
}


public class Company_Management {
    public static void main(String[] args) {
        
        Company company = new Company("Capgemini");

        company.addDepartment("Backend");
        company.addDepartment("Marketing");

        company.addEmployeeToDepartment("Backend", "Divyanshu");
        company.addEmployeeToDepartment("Backend", "Deepansh");
        company.addEmployeeToDepartment("Marketing", "Daksh");

        company.displayCompanyDetails();

        company.deleteCompany();
        System.out.println("\nCompany deleted.");
    }
}