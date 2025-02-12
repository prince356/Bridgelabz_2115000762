class Node {
    int rollNumber;
    String name;
    int age;
    String grade;
    Node next;

    public Node(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentRecordManagement {

    Node head = null;
    Node tail = null;
    int lengthList = 0;

    public void insertFromStarting(int rollNumber, String name, int age, String grade) {
        // check if this is the first node
        Node node = new Node(rollNumber, name, age, grade);
        if (head == null) {
            tail = node;
        }
        node.next = head;
        head = node;
        lengthList++;
    }

    public void insertFromLast(int rollNumber, String name, int age, String grade) {
        Node node = new Node(rollNumber, name, age, grade);
        if (tail == null) {
            head = node;
            tail = node;
        }
        node.next = null;
        tail.next = node;
        tail = node;
        lengthList++;
    }

    public void addSpecificPosition(int rollNumber, String name, int age, String grade, int pos) {

        if (pos == 1) {
            insertFromStarting(rollNumber, name, age, grade);
        } else if (pos == lengthList) {
            insertFromLast(rollNumber, name, age, grade);
        } else {
            Node temp = head;
            int location = pos - 2;
            while (location-- > 0 && temp.next != null) {
                temp = temp.next; // traverse till the postion
            }

            Node newNode = new Node(rollNumber, name, age, grade);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // delete based on the roll number
    public void deleteRollNumber(int rollNumber) {
        Node temp = head;
        while (temp.next.rollNumber != rollNumber && temp.next != null) { // going just one step behind the number u
                                                                          // wnat to delete
            temp = temp.next;
        }
        temp.next = temp.next.next;
        lengthList--;
    }

    public void displayData() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Student name :- " + temp.name);
            System.out.println("Student age :- " + temp.age);
            System.out.println("Student Roll number :- " + temp.rollNumber);
            System.out.println("Student Grade :- " + temp.grade);
            System.out.println("--");
            temp = temp.next;
        }
    }

    // display details based on student roll number
    public void displayDataRollnumber(int rollnumber) {
        Node temp = head;
        while (temp.rollNumber != rollnumber) {
            temp = temp.next;
        }
        System.out.println("Student name :- " + temp.name);
        System.out.println("Student age :- " + temp.age);
        System.out.println("Student Roll number :- " + temp.rollNumber);
        System.out.println("Student Grade :- " + temp.grade);
        System.out.println("--");
    }

    public void updateGrade(int rollnumber, String gradetochange) {
        Node temp = head;
        while (temp.rollNumber != rollnumber) {
            temp = temp.next;
        }
        temp.grade = gradetochange;
    }

    public static void main(String[] args) {
        StudentRecordManagement management = new StudentRecordManagement();
        management.insertFromLast(1, "Divyanshu", 21, "A");
        management.insertFromLast(2, "Krishna", 22, "A+");
        management.insertFromLast(3, "Prince", 21, "A");
        management.insertFromLast(4, "Deepansh", 22, "A-");
        management.insertFromLast(5, "Daksh", 21, "A++");
        management.insertFromLast(6, "Ayush", 22, "B+");
        management.addSpecificPosition(4, "Pulkit", 21, "B+", 4);
        management.deleteRollNumber(3);
        management.displayData(); // display all the students data
        management.displayDataRollnumber(2); // display data based on roll number of student
        management.updateGrade(2, "A-");
        management.displayDataRollnumber(2);
    }

}