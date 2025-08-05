package Task_20thJune;

import java.util.Scanner;

public class Task20thJune_CharisanAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println(ch+" is an alphabetic character");
        }
        else{
            System.out.println(ch+" is not an alphabetic character");
        }
    }
}
