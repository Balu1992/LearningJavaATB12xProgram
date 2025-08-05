package Task;

import java.util.Scanner;

public class Task19thJune_largestof3nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        Integer n1=sc.nextInt();
        Integer n2=sc.nextInt();
        Integer n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is largest");
        } else if (n2>n3) {
            System.out.println(n2+" is largest");
        }
        else{
            System.out.println(n3+" is largest");
        }
    }
}
