package Task.Task10thJuly.Task4_MO;

public class User {
    public void login(){
        System.out.println("User Login");
    }

    public static void main(String[] args) {
        AdminUser a=new AdminUser();
        a.login();
        RegularUser r=new RegularUser();
        r.login();
    }
}
