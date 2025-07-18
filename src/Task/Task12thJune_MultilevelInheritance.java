package Task;

public class Task12thJune_MultilevelInheritance {
    public static void main(String[] args) {
        Child c=new Child();
        System.out.println("Amount in C is:"+c.amount);
        System.out.println("Amount from G is:"+c.G);
        System.out.println("Name is:"+c.name);
        c.property();
        c.property1();
        c.property2();
        System.out.println("---------------------");
        Parent p=new Parent();
        p.property();//From grandpa class
        p.property1();
        System.out.println("-------------------------");
        Grandparent g=new Grandparent();
        g.property();

    }
}
class Grandparent{
    void property(){
        System.out.println("Grandpa's property");
    }
    int G=10;
}
class Parent extends Grandparent{
    void property1(){
        System.out.println("parent's property");
    }
    String name="Shankar";
}
class Child extends Parent{
    void property2(){
        System.out.println("Child's property");
    }
    double amount=100.0;
}
