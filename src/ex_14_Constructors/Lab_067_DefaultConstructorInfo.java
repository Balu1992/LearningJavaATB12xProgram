package ex_14_Constructors;

public class Lab_067_DefaultConstructorInfo {
    public static void main(String[] args) {
        Parent p = new Parent();
        new Parent();
        new Parent();
        Parent p2; // Default constructor is called three times.
    }
}
    class Parent{
        String name;
        Parent(){
            System.out.println("I am called always");
        }
    }


