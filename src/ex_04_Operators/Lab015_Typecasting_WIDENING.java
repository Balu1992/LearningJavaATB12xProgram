package ex_04_Operators;
//TYPECASTING is the process of converting one data type to another data type.
// There are two types in typecasting: WIDENING & NARROWING
//Widening means conversion of smaller data type to bigger data type
public class Lab015_Typecasting_WIDENING {
    public static void main(String[] args) {
        //WIDENING demo
        byte b=2;
        int a=b; //BYTE is smaller than int and hence widening is done automatically from JVM.
        System.out.println(a);
    }
}
