package ex_19_Abstraction;

public class Lab_090_AbstractClassDemo {
    public static void main(String[] args) {
        car c=new car();
        c.drive(); //Abstraction is achieved by hiding startengine and stopengine method names and only it's content is exposed
    }
}
abstract class Vehicle{
    abstract void stopEngine();
    void startEngine(){
        System.out.println("Starting the engine");
    }
}
class car extends Vehicle{
    @Override
    void stopEngine(){
        System.out.println("Engine stopped");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}

