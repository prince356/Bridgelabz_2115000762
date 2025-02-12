class Node {
    String textState;
    Node prev;
    Node next;

    public Node(String textState) {
        this.textState = textState;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private Node currentState;
    private Node head;
    private Node tail;
    private int historySize;
    private int currentHistorySize;

    public TextEditor(int historySize) {
        this.historySize = historySize;
        this.currentHistorySize = 0;
        this.currentState = null;
        this.head = null;
        this.tail = null;
    }

    public void addState(String text) {
        Node newNode = new Node(text);

        if (currentState != null && currentState.next != null) {
            currentState.next = null;  // Clear redo history
        }

        if (currentState == null) {
            head = tail = currentState = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            currentState = tail;
        }

        if (currentHistorySize < historySize) {
            currentHistorySize++;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
//undo 
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.textState);
        } else {
            System.out.println("No more actions to undo.");
        }
    }
//redo
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.textState);
        } else {
            System.out.println("No more actions to redo.");
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current state: " + currentState.textState);
        } else {
            System.out.println("No text state available.");
        }
    }

    // Get current history size
    public int getHistorySize() {
        return currentHistorySize;
    }
}

public class UndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5);
        //adding text here
        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");
        editor.addState("Hello, World!!");
        editor.addState("Hello, World!!!");

        // Display current state
        editor.displayCurrentState();

        editor.addState("Hello, World!!!!");
        editor.displayCurrentState();  // This will be the most recent state

        editor.undo();  
        editor.undo();  
        editor.redo();  
        editor.redo();  
        System.out.println("Current history size: " + editor.getHistorySize());
    }
}
