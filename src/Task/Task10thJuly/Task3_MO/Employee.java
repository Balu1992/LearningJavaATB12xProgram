package Task.Task10thJuly.Task3_MO;

public class Employee {
    public void role(){
        System.out.println("General Employee");
    }

    public static void main(String[] args) {
        Manager m=new Manager();
        m.role();
        Tester t=new Tester();
        t.role();
        Clerk c=new Clerk();
        c.role();
    }
}
