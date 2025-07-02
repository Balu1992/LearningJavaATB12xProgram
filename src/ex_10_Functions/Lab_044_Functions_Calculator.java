package ex_10_Functions;

import java.util.Scanner;

public class Lab_044_Functions_Calculator {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n1=readInteger(sc,"Enter the num1:");
            int n2=readInteger(sc,"Enter the num2:");

            int SUM=sum(n1,n2); // This is also called as method overloading.
            int SUB=minus(n1,n2);
            int MUL=mul(n1,n2);
            int DIV=div(n1,n2);

        System.out.println(SUM);
        System.out.println(SUB);
        System.out.println(MUL);
        System.out.println(DIV);
        }

    static int readInteger(Scanner sc,String msg){
        System.out.println(msg);
        if(sc.hasNextInt()){
            return sc.nextInt();
        }
        else{
            System.out.println("Please enter number only");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a,int b){
        return a+b;
    }
    static int minus(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        else{
            return a/b;
        }
    }
}
