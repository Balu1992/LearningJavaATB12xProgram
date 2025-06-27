package ex_06_SwitchCases;

import java.util.Scanner;

public class Lab028_SwitchOperatordemo_5 {
    public static void main(String[] args) {
        //Grouping multiple statements in switch
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day:");
        int day=1;
        if(sc.hasNextInt())
            day=sc.nextInt();

        switch (day) {
            case 1, 3, 5 -> System.out.println("Odd days");
            case 2, 4, 6 -> System.out.println("Even days");
            default -> System.out.println("Maja days");

        }
        }
    }
