package Task;

import java.util.Scanner;

public class Task17thJune_PositiveorNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n+" is positive number");
        }
        else{
            System.out.println(n+" is negative number");
        }
    }
}
