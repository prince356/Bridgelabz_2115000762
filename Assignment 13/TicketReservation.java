
class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null; 
    }
}

class CircularLinkedList {
    private Ticket head = null;  
    private Ticket tail = null;  
    private int size = 0;

    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        
        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;  
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; 
        }
        size++;
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head;
        Ticket previous = null;

        if (current.ticketID == ticketID) {
            if (head == tail) { // Only one ticket in the list
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;  // Update the tail to point to new head
            }
            size--;
            return;
        }

        // Traverse the circular list to find the ticket
        do {
            previous = current;
            current = current.next;
            if (current.ticketID == ticketID) {
                previous.next = current.next;
                if (current == tail) {
                    tail = previous;  // Update tail if last ticket was removed
                }
                size--;
                return;
            }
        } while (current != head);  // Loop back to head if not found

        System.out.println("Ticket with ID " + ticketID + " not found.");
    }

    // Display all the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);  // Loop until we reach the head again
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);  // Loop until we reach the head again

        if (!found) {
            System.out.println("No tickets found matching '" + searchTerm + "'.");
        }
    }

    // Calculate the total number of booked tickets
    public int totalTickets() {
        return size;
    }
}

public class TicketReservation {
    public static void main(String[] args) {
        // Create a CircularLinkedList to store the tickets
        CircularLinkedList ticketSystem = new CircularLinkedList();

        // Add tickets to the system
        ticketSystem.addTicket(1, "Divyanshu", "Avengers", "A1", "2025-02-12 10:00");
        ticketSystem.addTicket(2, "Deepansh", "Avatar", "B3", "2025-02-12 11:00");
        ticketSystem.addTicket(3, "Prince ", "Avengers", "C5", "2025-02-12 12:00");

        // Display all tickets
        System.out.println("All Tickets:");
        ticketSystem.displayTickets();

        // Search for tickets by customer name or movie name
        System.out.println("\nSearch Results for 'Avengers':");
        ticketSystem.searchTicket("Avengers");

        // Remove a ticket by Ticket ID
        System.out.println("\nRemoving ticket with ID 2...");
        ticketSystem.removeTicket(2);

        // Display all tickets after removal
        System.out.println("\nAll Tickets after removal:");
        ticketSystem.displayTickets();

        // Calculate total number of tickets
        System.out.println("\nTotal Tickets: " + ticketSystem.totalTickets());
    }
}
