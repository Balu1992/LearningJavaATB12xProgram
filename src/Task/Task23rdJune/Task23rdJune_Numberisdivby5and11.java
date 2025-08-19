package Task.Task23rdJune;

import java.util.Scanner;

public class Task23rdJune_Numberisdivby5and11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println(n+" is divisible by 5");
        } else if (n%11==0) {
            System.out.println(n+" is divisible by 11");
        }
    }
}
