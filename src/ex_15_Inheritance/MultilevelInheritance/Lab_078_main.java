package ex_15_Inheritance.MultilevelInheritance;

public class Lab_078_main {
    public static void main(String[] args) {
        Lab_077_Son s=new Lab_077_Son();
        s.gf_property();
        s.son_prop();
        s.Father_prop(); // Son can access all the methods
        System.out.println("--------------");
        Lab_076_Father f=new Lab_076_Father();
        f.Father_prop();
        f.gf_property(); //father can access only his & gf property
    }
}
