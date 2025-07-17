package ex_17_Encapsulation;

public class Lab_088_Encapsulation {
    public static void main(String[] args) {
    Student s=new Student("Balaji","1234");
    s.setUsername("Balu");
    s.setPassword("5678");
        System.out.println(s.getUsername());
        System.out.println(s.getPassword());
    }
}
class Student{
    private String username;
    private String password;

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

