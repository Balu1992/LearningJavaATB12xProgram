package ex_06_SwitchCases;

import java.util.Scanner;

public class Lab_024_SwitchOperatordemo_1 {
    public static void main(String[] args) {
        // Ask the user to enter an integer value from 1 to 7.
        // If user enters the value between 1-7, then print the corresponding day.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int day=1; // To accept user input
        if(sc.hasNextInt())
            day=sc.nextInt();
        else
            System.out.println("Please enter a valid integer num only");
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter number from 1 to 7 only");
        }
    }
}
