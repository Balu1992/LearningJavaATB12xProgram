package Task;

import java.util.Scanner;

public class Task25thMay_ReversingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:\t");
        int n=sc.nextInt();

        int rev=0;
        for (; n != 0; n /= 10)
            rev = rev * 10 + n % 10;
        System.out.println("Reversed Number is:\t"+rev);
    }
}
