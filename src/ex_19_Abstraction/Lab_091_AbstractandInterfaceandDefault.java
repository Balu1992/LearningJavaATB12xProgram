package ex_19_Abstraction;

public class Lab_091_AbstractandInterfaceandDefault {
    public static void main(String[] args) {
        car1 c=new car1();
        c.drive(); //Abstraction is achieved by hiding startengine and stopengine method names and only it's content is exposed
    }
}

abstract class Vehicle1{
    abstract void stopEngine();
    void startEngine(){
        System.out.println("Starting the engine");
    }
}
class car1 extends Vehicle1 implements tyre,gear{ //MULTIPLE INHERITANCE
    @Override
    void stopEngine(){
        System.out.println("Engine stopped");
    }
    void drive(){
        startEngine();
        color();
        gear();
        blacktyre();
        stopEngine();
    }

    @Override
    public void blacktyre() {
        System.out.println("It has blacktyre");
    }

    @Override
    public void color() {
        System.out.println("Color is red");
    }

    @Override
    public void gear(){
        System.out.println("Gear has been shifted");
    }
}
// Since we cannot inherit from two classes, we'll use the concept of interfaces here
interface tyre{
    void blacktyre();
    //Interface will always have incomplete methods in it
    //To define complete methods inside interface, we use DEFAULT keyword
    default void color(){

    }
}
interface gear{
    void gear();
}
