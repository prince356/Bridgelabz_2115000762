import java.util.Scanner;

public class Level1_Question2 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int handshakes = calculateHandshakes(n);

        System.out.println("The maximum number of handshakes is: " + handshakes);

        sc.close();
    }
}
