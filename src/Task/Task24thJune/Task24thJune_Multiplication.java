package Task.Task24thJune;

import java.util.Scanner;

public class Task24thJune_Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table value");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}

