package Task;

import java.util.Scanner;

public class Task31stMay_ReversingwithInbuiltfunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        StringBuffer s=new StringBuffer(sc.next());
        System.out.println("Reversed String is:"+s.reverse());
    }
}
