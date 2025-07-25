package ex_22_Exceptions;

public class Lab_098_trywithmultiplecatch {
    public static void main(String[] args) {
        int a=0;
        int b=100;
        try {
            int c=b/a;
            String name=null;
            name.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
