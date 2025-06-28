package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task24thMay_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade");
        String input=sc.nextLine().toUpperCase();
        switch(input){
            case "A" -> System.out.println("A grade");
            case "B" -> System.out.println("B grade");
            case "C" -> System.out.println("C grade");
            default -> System.out.println("Invalid grade");
        }
    }
}
