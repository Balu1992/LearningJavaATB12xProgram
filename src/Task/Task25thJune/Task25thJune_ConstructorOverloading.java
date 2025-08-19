package Task.Task25thJune;

public class Task25thJune_ConstructorOverloading {
    public static void main(String[] args) {
        person p1=new person();
        person p2=new person("Navya");
        person p3=new person("Balaji", 32);
        p1.display();
        p2.display();
        p3.display();
    }
}
class person{
    String name;
    int age;
    person(){
        name= "Balu";
        age=25;
    }

    person(String name){
        this.name=name;
        age=30;
    }
    person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("person name: "+ name +" & "+ " age "+age );
    }
}
