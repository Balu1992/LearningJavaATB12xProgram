package Task;

import java.util.Scanner;

public class Task25thMay_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=1;
        if(n<=0){
            fact=1;
        }
        int i=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println("Factorial of number is:\t"+fact);
    }
}
