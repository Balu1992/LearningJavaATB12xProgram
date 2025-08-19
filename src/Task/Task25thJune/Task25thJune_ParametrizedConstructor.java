package Task.Task25thJune;

public class Task25thJune_ParametrizedConstructor {
    public static void main(String[] args) {
        student s= new student("aparna");
        s.display();

    }
}
class student{
    String name;

    student(String name) {
        this.name = name;
    }
    void display(){
        System.out.println("Student name: "+name);
    }
}
