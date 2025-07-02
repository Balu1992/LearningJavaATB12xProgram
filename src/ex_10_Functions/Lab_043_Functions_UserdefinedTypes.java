package ex_10_Functions;

import java.util.Scanner;

public class Lab_043_Functions_UserdefinedTypes {
    public static void main(String[] args) {
        //There are 4 different types of UD functions
        // 1. Without parameter & without retyrn type
        // 2. Without parameter & with retyrn type
        // 3. With parameter & with retyrn type
        // 4. With parameter & without retyrn type

        // 1. Without parameter & without retyrn type
        wp_wr_greet();

        // 2. Without parameter & with retyrn type
        String msg=wp_with_r();  //Here String is used because i function we've String.
        System.out.println(msg);

        // 4. With parameter & without retyrn type
        with_p_without_r("Balaji",32);
        //We can take input from user here too.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter age:");
        int age=sc.nextInt();

        with_p_without_r(name,age);

        // 3. With parameter & with retyrn type
        int s=with_p_with_r(5,6);
        System.out.println(s);
    }
    // 1. Without parameter & without retyrn type
    static void wp_wr_greet(){
        System.out.println("Static-> Without parameter & void-> Without return type");
    }

    // 2. Without parameter & with retyrn type
    static String wp_with_r(){
        System.out.println("I am called first");
        return "I am called next with return type as string";
    }

    // 4. With parameter & without retyrn type
    static void with_p_without_r(String name, int age){
        System.out.println("Name is\t:"+name+" "+"and age is\t:"+age);
    }

    // 3. With parameter & with retyrn type
    static int with_p_with_r(int a,int b){
        return a+b;
    }
}
