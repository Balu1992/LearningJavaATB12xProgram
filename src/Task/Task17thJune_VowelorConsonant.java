package Task;

import java.util.Scanner;

public class Task17thJune_VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char c=sc.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
            System.out.println("Its an vowel");
        }
        else{
            System.out.println("It's an consonant");
        }
    }
}
