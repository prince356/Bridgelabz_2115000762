class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team Name: " + teamName);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "HR", 50000.0);
        emp1.displayEmployeeDetails();
        emp1.setSalary(55000.0);
        System.out.println("Updated Salary: $" + emp1.getSalary());

        System.out.println();

        Manager mgr1 = new Manager(102, "IT", 70000.0, "Tech Team");
        mgr1.displayManagerDetails();
    }
}
