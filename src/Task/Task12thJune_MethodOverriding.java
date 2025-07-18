package Task;

public class Task12thJune_MethodOverriding {
    public static void main(String[] args) {
        B b=new B();
        b.method();
    }
}
class A{
    void method(){
        System.out.println("A's method");
    }
}
class B extends A{
    @Override
    void method(){
        System.out.println("B's method");
    }
}
