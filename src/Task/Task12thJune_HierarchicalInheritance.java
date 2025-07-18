package Task;

public class Task12thJune_HierarchicalInheritance {
    public static void main(String[] args) {
        Vehicle1 v=new Vehicle1();
        v.engine();
        System.out.println("---------------");
        car c=new car();
        c.color();
        c.engine();
        System.out.println("-----------------");
        bike b=new bike();
        b.color();
        b.engine();
    }
}
class Vehicle1{
    void engine(){
        System.out.println("Engine started");
    }
}
class car extends Vehicle1{
    void color(){
        System.out.println("Car color is red");
    }
}
class bike extends Vehicle1{
    void color(){
        System.out.println("Bike color is blue");
    }
}
