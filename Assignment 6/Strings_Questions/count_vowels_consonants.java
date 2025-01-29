import java.util.Scanner;

public class count_vowels_consonants {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();

        input = input.toLowerCase();
        int vowels=0, consonants=0;

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels in "+input+" is "+vowels);
        System.out.println("The number of consonants in "+input+" is "+consonants);

        sc.close();
        
    }
}