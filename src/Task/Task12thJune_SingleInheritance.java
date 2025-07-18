package Task;

public class Task12thJune_SingleInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog makes sound");
    }
}
