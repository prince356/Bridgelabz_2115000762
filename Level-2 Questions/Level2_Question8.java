import java.util.Scanner;

public class Level2_Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Amar");
        int AmarAge = sc.nextInt();
        System.out.println("Enter the age of Akbar");
        int AkbarAge = sc.nextInt();
        System.out.println("Enter the age of Anthony");
        int AnthonyAge = sc.nextInt();
        System.out.println("Enter the height of Amar");
        int AmarHeight= sc.nextInt();
        System.out.println("Enter the height of Akbar");
        int AkbarHeight = sc.nextInt();
        System.out.println("Enter the age of Anthony");
        int AnthonyHeight = sc.nextInt();

        //finding the tallest friend
        if (AmarHeight > AkbarHeight && AkbarHeight > AnthonyHeight) {
            System.out.println("The Tallest Friend is Amar with the height of " + AmarHeight);
        }
        else if (AkbarHeight > AmarHeight && AmarHeight > AnthonyHeight) {
            System.out.println("The Tallest Friend is Akbhar with the height of" + AkbarHeight );
        }
        else{
            System.out.println("The Tallest Friend is Anthony with the height of" + AnthonyHeight );
        }
        //finding the youngest friends
        if (AmarAge > AkbarAge && AkbarAge > AnthonyAge) {
            System.out.println("The Youngest Friend is Anthony of age " +  AnthonyAge);
        }
        else if (AmarAge > AnthonyAge && AnthonyAge > AkbarAge) {
            System.out.println("The Youngest Friend is Akbar of age " + AkbarAge);
        }
        else{
            System.out.println("The Youngest Friend is Amar of age " + AmarAge);
        }


        sc.close();
    }
}
