package ex_14_Constructors;

public class Lab_071_PC2_ConstructorOverloading {
    public static void main(String[] args) {
        Lab_070_PC1 pc1=new Lab_070_PC1("Tesla",2025);
        System.out.println(pc1.name);
        System.out.println(pc1.model);

        Lab_070_PC1 pc2=new Lab_070_PC1();
        System.out.println(pc2.name);
        System.out.println(pc2.model);

        Lab_070_PC1 pc3=new Lab_070_PC1("Mahindra");
        System.out.println(pc3.name);
        System.out.println(pc3.model);
        // This is called as CONSTRUCTOR OVERLOADING
        }
    }

