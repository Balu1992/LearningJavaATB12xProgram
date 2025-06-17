package ex_04_Operators;

public class Lab012_LogicalOperator {
    //Logical operators are : AND(&&), OR(||), NOT(!)
    public static void main(String[] args) {
        boolean a=true;
        System.out.println(!a);

        boolean b=false;
        System.out.println(!!b);

        boolean c=a||b;
        System.out.println(c);

        boolean d=a&&a;
        System.out.println(d);
    }
}
