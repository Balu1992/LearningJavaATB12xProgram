package ex_05_IfElsetopics;

import java.util.Scanner;

public class Lab023_UserinputbyScanner {
    public static void main(String[] args) {
        System.out.println("Enter age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Eligible for DL");
        }
        else{
            System.out.println("Not eligible!! ");
        }
    }
}
