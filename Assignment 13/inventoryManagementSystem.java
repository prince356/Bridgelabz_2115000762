class Node {
    String name;
    int itemId;
    int quantity;
    int price;
    Node next;

    public Node(int itemId, String name, int quantity, int price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class inventoryManagementSystem {

    Node head = null;
    Node tail = null;
    int lengthList = 0;

    // Insert methods
    public void insertFromStarting(int itemId, String name, int quantity, int price) {
        Node node = new Node(itemId, name, quantity, price);
        if (head == null) {
            tail = node;
        }
        node.next = head;
        head = node;
        lengthList++;
    }

    public void insertFromLast(int itemId, String name, int quantity, int price) {
        Node node = new Node(itemId, name, quantity, price);
        if (tail == null) {
            head = node;
            tail = node;
        }
        node.next = null;
        tail.next = node;
        tail = node;
        lengthList++;
    }

    public void addSpecificPosition(int itemId, String name, int quantity, int price, int pos) {
        if (pos == 1) {
            insertFromStarting(itemId, name, quantity, price);
        } else if (pos == lengthList) {
            insertFromLast(itemId, name, quantity, price);
        } else {
            Node temp = head;
            int location = pos - 2;
            while (location-- > 0 && temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(itemId, name, quantity, price);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        lengthList++;
    }

    public void removeItem(int itemId) {
        Node temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            lengthList--;
        }
    }

    public void displayData() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Item ID :- " + temp.itemId);
            System.out.println("Item name :- " + temp.name);
            System.out.println("Item Quantity :- " + temp.quantity);
            System.out.println("Item Price:- " + temp.price);
            System.out.println("------------------------------");
            temp = temp.next;
        }
    }

    public void updateQuantity(int quantity, int itemId) {
        Node temp = head;
        while (temp != null && temp.itemId != itemId) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.quantity = quantity;
        }
    }

    public void searchItemId(int itemId) {
        Node temp = head;
        while (temp != null && temp.itemId != itemId) {
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println("Item ID :- " + temp.itemId);
            System.out.println("Item name :- " + temp.name);
            System.out.println("Item Quantity :- " + temp.quantity);
            System.out.println("Item Price:- " + temp.price);
            System.out.println("------------------------------");
        }
    }

    public void searchItemId(String name) {
        Node temp = head;
        while (temp != null && !temp.name.equals(name)) {
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println("Item ID :- " + temp.itemId);
            System.out.println("Item name :- " + temp.name);
            System.out.println("Item Quantity :- " + temp.quantity);
            System.out.println("Item Price:- " + temp.price);
            System.out.println("------------------------------");
        }
    }

    public void inventoryWorth() {
        Node temp = head;
        double sum = 0;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("The total Value of Inventory is:- $" + sum);
    }

    // Merge Sort Logic

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;  // Base case: if the list is empty or contains only one item
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;  // Split the list into two halves

        Node left = mergeSort(head);  // Sort the left half
        Node right = mergeSort(nextOfMiddle);  // Sort the right half

        return merge(left, right);  // Merge the two sorted halves
    }

    public Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.price <= right.price) {
            left.next = merge(left.next, right);
            left.next = right;
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    public Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    // Function to start the merge sort
    public void sortInventoryByPrice() {
        head = mergeSort(head);  // Sort the linked list
    }

    public static void main(String[] args) {
        inventoryManagementSystem management = new inventoryManagementSystem();
        management.insertFromLast(101, "Apple", 1040, 100);
        management.insertFromLast(102, "Pen", 1400, 30);
        management.insertFromLast(103, "Headphones", 150, 200);
        management.insertFromLast(104, "Laptop", 1220, 400);
        management.insertFromLast(105, "Frozen Pizza", 100, 200);

        System.out.println("Before Sorting:");
        management.displayData();

        // Sort inventory by price
        management.sortInventoryByPrice();

        System.out.println("After Sorting:");
        management.displayData();
    }
}
