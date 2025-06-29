package Task;

import java.util.Scanner;

public class Task25thMay_Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:\t");
        int n=sc.nextInt();
        int first=0,second=1;
        for(int i=0;i<n;i++){
            System.out.println(first+" ");
            int n1=first+second;
            first=second;
            second=n1;
        }
    }
}
