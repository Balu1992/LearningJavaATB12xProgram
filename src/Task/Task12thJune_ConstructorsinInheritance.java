package Task;

public class Task12thJune_ConstructorsinInheritance {
    public static void main(String[] args) {
        Child1 c=new Child1(33);
        System.out.println("Age is:"+c.age);
        System.out.println("--------------");
        Parent1 p=new Parent1();
        Parent1 p1=new Parent1("Balu");
        System.out.println("Name is:"+p1.name);
    }
}
class Parent1{
    String name="Balaji";
    Parent1(){
        System.out.println("I will be called always when parent is executed");
    }
    Parent1(String name){
        this.name=name;
    }
}
class Child1 extends Parent1{
    int age=32;
    Child1(int age){
        this.age=age;
    }
}
