package Task;

import java.util.Scanner;

public class Task19thJune_maxof2nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc1.nextInt();
        if(n1>n2){
            System.out.println(n1+" is greater");
        }
        else{
            System.out.println(n2+" is greater");
        }
    }
}
