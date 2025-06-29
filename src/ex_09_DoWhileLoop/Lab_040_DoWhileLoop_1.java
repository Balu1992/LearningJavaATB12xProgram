package ex_09_DoWhileLoop;

public class Lab_040_DoWhileLoop_1 {
    public static void main(String[] args) {
        //In do-while loop,body of the loop is checked atleast once before the condition is checked.
        int a=1;
        do{
            System.out.println("Body for the\t"+a+"\tis executed");
            a++;
        }while(a<10);
    }
}
