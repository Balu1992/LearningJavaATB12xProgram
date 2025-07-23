package ex_21_wrapperclasses;

public class Lab_095_Boxing {
    public static void main(String[] args) {
        //In java, we've primitive data types such as int,float,char, long, double etc.
        //If we use this data types, then we won't get any special properties of it like MAX_VALUE, MIN_VALUE etc.
        // To achieve special properties, we'll use WRAPPER class methods such as INTEGER, FLOAT, DOUBLE etc.
        // It's explained below.
        int a=10; //primitive data types
        //giving "a." doesn;t give any special methods.
        Integer b=a; //Wrapper class
        //Here JVM automatically converts a's value from int to INTEGER i/e, smaller data type to bigger and is known as boxing.
        System.out.println(b.hashCode());
    }
}
