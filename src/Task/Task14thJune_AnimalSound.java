package Task;

public class Task14thJune_AnimalSound {
    public static void main(String[] args) {
        Dog1 d=new Dog1();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
    }
}
abstract class Animal1{
    abstract void makeSound();
}
class Dog1 extends Animal1{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal1{
    @Override
    void makeSound(){
        System.out.println("Cat meows");
    }
}
