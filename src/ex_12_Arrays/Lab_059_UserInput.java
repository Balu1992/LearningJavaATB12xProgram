package ex_12_Arrays;

import java.util.Scanner;

public class Lab_059_UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int a=sc.nextInt();

        String[] marks=new String[a];
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter elements now:");
            marks[i]=sc.next();
        }
        for(String mark:marks){
            System.out.println("Entered elements are:"+mark);
        }
        sc.close();
    }
}
