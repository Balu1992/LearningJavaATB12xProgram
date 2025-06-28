package Task;

import java.util.Scanner;

public class Task24thMay_3 {
    public static void main(String[] args) {
        //Factorial of number by user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number:");
        int n=sc.nextInt();
        int fact=1;
        if(n==0){
            fact=1;
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of number is:"+fact);
    }
}
