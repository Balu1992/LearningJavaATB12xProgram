package ex_04_Operators;

public class Lab017_TernaryOperator {
    public static void main(String[] args) {
        // result=condition?expression1:expression2
        int age=17;
        String result=age>=18?"Yes":"No";
        System.out.println(result);
    }
}
