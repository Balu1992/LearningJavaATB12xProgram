package Task;

public class Task14thJune_ConstructorsinAbstractClass {
    public static void main(String[] args) {
        balu1 b=new balu1();
        b.method();

    }
}
abstract class balu{
    balu(){
        System.out.println("Abstract class constructor called");
    }
    void method(){
        System.out.println("Method from abstract class");
    }
}
class balu1 extends balu{

}


