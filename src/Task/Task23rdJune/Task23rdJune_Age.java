package Task.Task23rdJune;

import java.util.Scanner;

public class Task23rdJune_Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        Integer age=sc.nextInt();
        if(age>0 && age<=12){
            System.out.println("Child");
        } else if (age>12 && age<=19) {
            System.out.println("Teenager");
        } else if (age>19 && age<=64) {
            System.out.println("Adult");
        } else if (age>65 && age<100) {
            System.out.println("Senior Citizen");
        }else {
            System.out.println("Wrong age");
        }
    }
}
