package Task.Task23rdJune;

import java.util.Scanner;

public class Task23rdJune_Monthsdaysyears {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter days:");
        int totdays=sc.nextInt();
        int years=totdays/365;
        int remaining_days=totdays%365;
        int months=remaining_days/30;
        int days=remaining_days%30;
        System.out.println("The output is:"+years+"years"+" "+months+"months"+" "+days+"days");
    }
}
