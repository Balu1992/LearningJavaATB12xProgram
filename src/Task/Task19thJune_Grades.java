package Task;

import java.util.Scanner;

public class Task19thJune_Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers between 0-100");
        String grade = "";
        int marks=sc.nextInt();
        if(marks<0 || marks>100){
            System.out.println("Please enter marks between 0 & 100 only");
            System.exit(0);
        }
        else{
            
            if(marks>=90){
                grade="A+";
            } else if (marks>=80) {
                grade="A";
            }else if(marks>=70){
                grade="B";
            } else if (marks>=60) {
                grade="C";
            }else if(marks>=50){
                grade="D";
            }else if(marks>=40){
                grade="E";
            }
            else{
                System.out.println("Fail");
            }
            System.out.println("Grade is:"+grade);
        }
    }
}
