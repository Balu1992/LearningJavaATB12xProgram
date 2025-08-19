package Task.Task_20thJune;

import java.util.Scanner;

public class Task20thJune_Loanprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=sc.nextInt();
        System.out.print("Enter salary:");
        double salary=sc.nextDouble();
        System.out.print("Enter credit score:");
        int creditScore=sc.nextInt();
        if (!agecal(age)) {
            System.out.println("Invalid age. Age must be between 18 and 80.");
        } else if (!salarycal(salary)) {
            System.out.println("Invalid salary. Salary must be at least 30,000.");
        } else if (!CScal(creditScore)) {
            System.out.println("Invalid credit score. Credit score must be between 650 and 850.");
        } else {
            System.out.println("You are eligible for a loan.");
        }
    }
    public static boolean agecal(int age){
        return age>=18 && age<=80;
    }
    public static boolean salarycal(double salary) {
        return salary >= 30000;
    }
    public static boolean CScal(int creditScore) {
        return creditScore >= 650 && creditScore <= 850;
    }
}
