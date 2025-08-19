package Task.Task25thJune;

public class Task25thJune_defaultconstructor {
    public static void main(String[] args) {
        Car C=new Car();
        C.display();
    }
}
class Car{
    String model;
    int year;

    Car() {
        model="XXX";
        year=2023;
    }
    void display(){
        System.out.println("model of the car "+model + " & "+ "year "+year);
    }
}
