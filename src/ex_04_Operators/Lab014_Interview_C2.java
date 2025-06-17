package ex_04_Operators;

public class Lab014_Interview_C2 {
    public static void main(String[] args) {
        String a="Balaji";
        String b="BS";
        int a1=10;
        int b1=20;
        System.out.println(a+b+a1+b1); //BalajiBS1020 IMPORTANT
        System.out.println(a1+b1+a+b); //30BalajiBS
        System.out.println(a+b+(a1+b1)); //BalajiBS30
    }
}
