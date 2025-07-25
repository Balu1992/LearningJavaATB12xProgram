package Task;

public class Task15thJune_AutoboxingUnboxing {
    public static void main(String[] args) {
        //Converting PRIMITIVE to WRAPPER classes is called AUTOBOXING
        int aa=10;
        Integer ba=aa;
        System.out.println("Value of ba is:"+ba);

        //Converting WRAPPER classes to PRIMITIVE is called as UNBOXING
        Integer cc=20;
        int dd=cc;
        System.out.println("Value of dd is:"+dd);
    }
}
