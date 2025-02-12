// Process class
class Process {
    int processId;
    int burstTime;
    int priority;
    int remainingTime;  
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class CircularLinkedList {
    private Process head = null;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;  // Point to itself to make it circular
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    //remove process
    public void removeProcess(int processId) {
        if (head == null) return;

        if (head.processId == processId) {
            if (head.next == head) {
                head = null;  
            } else {
                Process temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        Process temp = head;
        while (temp.next != head && temp.next.processId != processId) {
            temp = temp.next;
        }

        if (temp.next.processId == processId) {
            temp.next = temp.next.next;
        }
    }

    // Round Robin 
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) return;

        Process temp = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        Process countTemp = head;
        do {
            processCount++;
            countTemp = countTemp.next;
        } while (countTemp != head);

        while (processCount > 0) {
            if (temp.remainingTime > 0) {
                int execTime = Math.min(temp.remainingTime, timeQuantum);
                temp.remainingTime -= execTime;
                System.out.println("Process " + temp.processId + " executed for " + execTime + " units.");

                if (temp.remainingTime == 0) {
                    totalWaitingTime += (totalTurnaroundTime - temp.burstTime);
                    totalTurnaroundTime += temp.burstTime;
                    System.out.println("Process " + temp.processId + " completed execution.");
                    removeProcess(temp.processId);
                    processCount--;
                }

                totalTurnaroundTime += execTime;
            }

            temp = temp.next;
        }

        System.out.println("\nAverage Waiting Time: " + (totalWaitingTime / (double) processCount));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double) processCount));
    }

    //display the process
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes to display.");
            return;
        }

        Process temp = head;
        System.out.println("Current Processes in Queue:");
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime +
                    ", Priority: " + temp.priority + ", Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        CircularLinkedList processList = new CircularLinkedList();
        
        // Add processes
        processList.addProcess(1, 10, 1);
        processList.addProcess(2, 5, 2);
        processList.addProcess(3, 8, 3);
        processList.addProcess(4, 12, 4);
        
        int timeQuantum = 4;  
        
        System.out.println("Initial Process List:");
        processList.displayProcesses();

        // Simulate Round Robin Scheduling
        processList.roundRobinScheduling(timeQuantum);
    }
}
