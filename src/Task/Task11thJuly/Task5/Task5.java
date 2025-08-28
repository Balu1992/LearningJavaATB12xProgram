package Task.Task11thJuly.Task5;

public class Task5 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(); //same package access
        s1.showDetails();
    }
}

class Student1{
    void showDetails(){ // default access
        System.out.println("Student details shown");
    }
}
