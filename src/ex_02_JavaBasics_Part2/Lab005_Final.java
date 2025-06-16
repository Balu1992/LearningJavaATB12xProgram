package ex_02_JavaBasics_Part2;

public class Lab005_Final {
    public static void main(String[] args) {
        //Final keyword is used to make the values as constants to varibales.
        int a=10;
        System.out.println("Value of a is:"+a);
        final int a1=20;
        int a2=a1+1;
        System.out.println("A2 is:"+a2);
        //a1=22; //JVM throws error if we try to modify variable dclared with FINAL.
    }
}
