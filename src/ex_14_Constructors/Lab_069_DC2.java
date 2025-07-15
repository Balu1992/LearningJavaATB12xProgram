package ex_14_Constructors;

public class Lab_069_DC2 {
    public static void main(String[] args) {
        Lab_068_DC1 t=new Lab_068_DC1();
        System.out.println("Name is:"+t.name); //Default value for name is taken from DC1
        t.age=26;
        System.out.println("Age is:"+t.age);

    }
}
