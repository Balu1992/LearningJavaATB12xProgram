package ex_06_SwitchCases;

import java.util.Scanner;

public class Lab_025_SwitchOperatordemo_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num=1;
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
            num=sc.nextInt();
        else
            System.out.println("Pls enter valid num");

        switch (num){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
        }
    }
}
