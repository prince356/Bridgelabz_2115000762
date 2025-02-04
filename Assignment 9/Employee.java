public class Employee {

    static String companyName;
    private String name;
    private final int id;
    private String designation;

    static int totalEmployee = 0;

    public Employee(String name, int id , String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployee);
    }

    public void displayDetails(){
       if(this instanceof Employee){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Designation: " + designation);
       }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Krishna", 5678, "software engineer ");
        Employee emp1 = new Employee("Kunal", 8569, " Senior software engineer ");
        emp.displayDetails();
        emp1.displayDetails();
        Employee.displayTotalEmployees();
    }
}
