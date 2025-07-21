package Task;

public class Task14thJune_AbstractVsConcrete {
    public static void main(String[] args) {
        Child3 c=new Child3();
        c.show();
        c.display();
    }
}
abstract class Parent3{
    abstract void show();
    void display(){
        System.out.println("Abstract method implemented");
    }
}
class Child3 extends Parent3{
    @Override
    void show(){
        System.out.println("Concrete method in abstract class");
    }
}