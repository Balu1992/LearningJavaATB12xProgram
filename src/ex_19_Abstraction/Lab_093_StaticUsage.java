package ex_19_Abstraction;

public class Lab_093_StaticUsage {
    public static void main(String[] args) {
        student s=new student("Balaji",33);
        s.display();
        student.College_name(); //This remains static as it'll be same for all students. We should call this
        //method by classname.method name
    }
}
class student{
    String name;
    int age;
    static String coll_name="Jain University";

    student(String n,int a){
        this.name=n;
        this.age=a;
    }
    void display(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
    static void College_name(){
        System.out.println(coll_name+" 9th block campus");
    }
}
