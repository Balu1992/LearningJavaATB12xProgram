package Task;

public class Task8thJune_OOPS {
    public static void main(String[] args) {
        Car c=new Car();
        c.b="Shaarvi";
        System.out.println(c);
        c.charsey();
        c.bhk1();
        c.color();
        c.getVeh_speed();
    }
}
class Vehicle{
    private int veh_speed=100;
    private String brand="Fiat";

    Vehicle(){
        System.out.println("I'm called always");
    }
    public int getVeh_speed() {
        return veh_speed;
    }

    public void setVeh_speed(int veh_speed) {
        this.veh_speed = veh_speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    void color(){
        System.out.println("I'm red");
    }

    void color(String blue){
        this.color();
    }

    void charsey(){
        System.out.println("Charsey");
    }

    void bhk(){
        System.out.println("3 bhk");
    }

}
class Car extends Vehicle {
    public Car(){
        super.bhk();
        super.charsey();
        super.color();
        super.color("Red");
        super.getVeh_speed();
        super.setVeh_speed(200);
        super.getVeh_speed();
    }
    String b="Balaji";
    void bhk1(){
        System.out.println("1 bhk");
    }
    @Override
    void charsey() {
        System.out.println("Calling from car class");
    }


}

