package ex_04_Operators;

public class Lab018_NestedTernaryOperator {
    public static void main(String[] args) {
        int a=50;
        int b=40;
        int c=30;
        String res=a>b?"A is greater":(b>c?"B is greater":"C is greater");
        System.out.println(res);
    }
}
