class Node {
    int taskId;
    String taskName;
    String priority;
    String dueDate;
    Node next;

    public Node(int taskId, String taskName, String priority, String duedate) {
        this.dueDate = duedate;
        this.priority = priority;
        this.taskId = taskId;
        this.taskName = taskName;
        this.next = null;
    }
}

public class TaskScheduler {

    Node tail = null;
    Node head = null;
    int lengthList = 0;

    public void addTaskEnd(int taskId, String taskName, String priority, String dueDate) {
        Node node = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = node;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        lengthList++;
    }

    public void addtaskstart(int taskId, String taskName, String priority, String dueDate) {
        Node node = new Node(taskId, taskName, priority, dueDate);
        if (tail == null) {
            head = node;
            tail = node;
            tail.next = node;
        } else {
            tail.next = node;
            node.next = head;
            head = node;
        }
        lengthList++;
    }

    public void addAtSpecific(int taskId, String taskName, String priority, String dueDate, int position) {
        Node node = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = node;
            return;
        }
        if (position == 1) {
            addtaskstart(taskId, taskName, priority, dueDate);
        } else if (position == lengthList) {
            addTaskEnd(taskId, taskName, priority, dueDate);
        } else {
            Node temp = head;
            int location = position - 2;
            while (location-- > 0) {
                temp = temp.next;
            }

        }
    }

    public void deleteTask(int taskId) {
        Node temp = head;
        if (head == null) {
            System.out.println("No element to delete");
            return;
        }
        // if the head has the value we want
        if (temp != null && temp.taskId == taskId) {
            // if there is only one element in the linked list
            if (temp.next == head) {
                head = null;
                tail = null;
                return;
            }
            tail.next = head.next;
            head = temp.next;
        }

        // find the element int he linked list
        do {
            temp = temp.next;
        } while (temp.next != head || temp.next.taskId == taskId);

        temp.next = temp.next.next;
    }

    // search based on the priority
    public void searchByPriority(String priority) {
        Node temp = head;

        if (temp == null) {
            System.out.println("The linked list is empty");
            return;
        }

        while (temp != tail) {
            if (temp.priority == priority) {
                System.out.println("Task Id:- " + temp.taskId);
                System.out.println("Task Name:- " + temp.taskName);
                System.out.println("Priority :- " + temp.priority);
                System.out.println("Due Date :- " + temp.dueDate);
                System.out.println("============================");
            }
            temp = temp.next;
        }
    }

    public void displayTask() {
        if (head == null)
            return;

        // we can print the data using the do while loop
        Node temp = head;
        do {
            System.out.println("Task Id:- " + temp.taskId);
            System.out.println("Task Name:- " + temp.taskName);
            System.out.println("Priority :- " + temp.priority);
            System.out.println("Due Date :- " + temp.dueDate);
            System.out.println("============================");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskEnd(1, "Wash clothes", "Low", "14 Feb 2025");
        scheduler.addTaskEnd(2, "Complete the assignment", "High", "12 Feb 2025");
        scheduler.addTaskEnd(3, "Upload a Video", "Mid", "16 Feb 2025");
        scheduler.addtaskstart(0, "Read Book", "High", "12 feb 2025");
        scheduler.searchByPriority("High");
        // scheduler.displayTask();
    }
}
