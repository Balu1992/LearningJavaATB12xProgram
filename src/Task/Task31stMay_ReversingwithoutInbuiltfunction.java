package Task;

import java.util.Scanner;

public class Task31stMay_ReversingwithoutInbuiltfunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.next();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
