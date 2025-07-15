package ex_15_Inheritance.HierarchicalInheritance;

public class Lab_082_main {
    public static void main(String[] args) {
        Lab_081_SecChild sc=new Lab_081_SecChild();
        sc.SecProp();
        sc.fprop();
        Lab_080_FirstChild fc=new Lab_080_FirstChild();
        fc.fprop();
        fc.firstchild();
        Lab_079_Father f=new Lab_079_Father();
        f.fprop();
    }
}
