//base class for employee
class Employee{
    protected String name;
    protected int id;
    protected double Salary;

    public Employee(String name , int id , double Salary){
        this.name = name;
        this.id = id;
        this.Salary = Salary;
    }

    //display the employee details
    public void employeeDetails(){
        System.out.println("The employee Name is:- " + name);
        System.out.println("Employee Id:- " + id);
        System.out.println("Salaray :- $ " + Salary);
    }
}

//subclass for Manager
class Manager extends Employee{
    private int TeamSize;

    public Manager(String name , int id , double salary , int TeamSize){
        super(name, id, salary);
        this.TeamSize = TeamSize;
    }

    @Override
    public void employeeDetails(){
        super.employeeDetails();
        System.out.println("The Teamsize :- " + TeamSize);
    } 
}

class Developer extends Employee{
    private String programmingLanguage ;


    public Developer(String name , int id , double salary , String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void employeeDetails(){
        super.employeeDetails();
        System.out.println("Programming Language:- " + programmingLanguage);
    }
}

class Intern extends Employee{
    private int duration ;


    public Intern(String name , int id , double salary ,int duration){
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void employeeDetails(){
        super.employeeDetails();
        System.out.println("Duration:- " + duration + " Months");
    }
}

public class Empoyee_management_system {
    public static void main(String[] args) {
        Employee manager = new Manager("Divyanshu", 1002, 30000, 10);
        Employee developer = new Developer("Deepansh", 1033, 10000, "Java");
        Employee intern = new Intern("Pulkit", 10034, 4000, 14);

        System.out.println("Employee Details :");
        manager.employeeDetails();
        System.out.println();
        developer.employeeDetails();;
        System.out.println();
        intern.employeeDetails();
    }
}
