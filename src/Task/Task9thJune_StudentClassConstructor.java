package Task;

public class Task9thJune_StudentClassConstructor {
    String name;
    int age;

    Task9thJune_StudentClassConstructor(String name1,int age1){
        this.name=name1;
        this.age=age1;
    }

    public static void main(String[] args) {
        Task9thJune_StudentClassConstructor t=new Task9thJune_StudentClassConstructor("Balaji",32);
        System.out.println("Name is:"+t.name);
        System.out.println("age is:"+t.age);
    }
}

