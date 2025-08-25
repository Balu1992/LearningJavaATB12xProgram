package Task.Task10thJuly.TAsk2_MO;

public class Vehicle {
    public void start(){
        System.out.println("Vehicle started!!");
    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.start();
        Car c=new Car();
        c.start();
    }
}
