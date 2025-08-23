package Task.Task9thJuly.Task3;

public class User {
    public void login(){
        System.out.println("Logged in from user class");
    }
    public static void main(String[] args) {
        SuperAdmin s=new SuperAdmin();
        s.login();
        s.accessAdminPanel();
        s.shutdownSystem();
    }
}
