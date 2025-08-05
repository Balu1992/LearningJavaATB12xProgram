package Task;

import java.util.Scanner;

public class Task19thJune_smallestof2nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1<n2){
            System.out.println(n1+" is smallest");
        }
        else{
            System.out.println(n2+" is smallest");
        }
    }
}
