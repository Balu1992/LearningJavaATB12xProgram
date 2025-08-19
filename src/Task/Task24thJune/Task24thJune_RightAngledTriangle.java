package Task.Task24thJune;

import java.util.Scanner;

public class Task24thJune_RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
