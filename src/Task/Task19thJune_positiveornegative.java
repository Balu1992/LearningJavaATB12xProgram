package Task;

import java.util.Scanner;

public class Task19thJune_positiveornegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
