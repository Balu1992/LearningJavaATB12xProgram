package ex_14_Constructors;

public class Lab_070_PC1 {
    String name;
    int model;
    Lab_070_PC1(){
        name="Hyundai";  //Default Constructor
        model=2020;
    }
    Lab_070_PC1(String name1,int model1){
        this.name=name1; //Parameterized Constructor
        this.model=model1;
    }
    Lab_070_PC1(String name2){
        this.name=name2;
    }
}
