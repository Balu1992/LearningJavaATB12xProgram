package Task;

import java.util.Scanner;

public class Task25thMay_LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year:\t");
        int leapyear=sc.nextInt();
        if(leapyear%4==0){
            if(leapyear%100!=0 || leapyear%400==0)
                System.out.println("It's a leap year");
        }
        else
            System.out.println("Not a leap year");
    }
}
