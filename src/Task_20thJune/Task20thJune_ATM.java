package Task_20thJune;

import java.util.Scanner;

public class Task20thJune_ATM {
    public static void main(String[] args) {
        int acc_bal=10000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amt=sc.nextInt();
        if(amt<=0 || amt>acc_bal){
            System.out.println("Please enter amount greater than zero and less than 10000");
            System.exit(0);
        } else if (amt<=100) {
            System.out.println("Please enter amount in multiples of 100");
            System.exit(0);
        } else{
            int new_bal=acc_bal-amt;
            System.out.println("balance is:"+new_bal);
        }
    }
}
