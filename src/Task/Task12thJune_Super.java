package Task;

public class Task12thJune_Super {
    public static void main(String[] args) {
        Child2 c=new Child2();
        System.out.println("Name is:"+c.name);
        System.out.println("Age is:"+c.age);
    }
}
class Parent2{
    String name="Balaji";
    int age=32;
    public String Getname(){
        return name;
    }
    public int Getage(){
        return age;
    }
    void test(){
        System.out.println("Test");
    }
}
class Child2 extends Parent2{
    public Child2(){
        super.test();
        super.Getage();
        super.Getname();
    }
}
