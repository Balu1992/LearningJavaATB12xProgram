package Task;

import java.util.Scanner;

public class Task31stMay_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String original=sc.next();
        original=original.replaceAll("a-zA-Z"," ").toLowerCase();
        String reverse=new StringBuilder(original).reverse().toString();
        if(original.equals(reverse)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
