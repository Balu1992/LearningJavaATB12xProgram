package ex_05_IfElsetopics;

public class Lab022_IfElsedemo {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("Eligible for DL");
        }
        else{
            System.out.println("Not eligible for DL");
        }
    }
}
