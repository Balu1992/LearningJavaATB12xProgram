package Task;

public class Task14thJune_defaultandstaticmethod {
    public static void main(String[] args) {
        car1 c=new car1();
        c.start();
        Vehicle2.fuelType();
    }
}
interface Vehicle2{
    default void start(){
        System.out.println("Vehicle Started");
    }
    static void fuelType(){
        System.out.println("Fuel Type is petrol");
    }
}
class car1 implements Vehicle2{

}
