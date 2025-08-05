package Task;

import java.util.Scanner;

public class Task19thJune_EvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }
}
