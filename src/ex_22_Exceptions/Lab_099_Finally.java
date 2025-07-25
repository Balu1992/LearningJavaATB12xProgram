package ex_22_Exceptions;

public class Lab_099_Finally {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        try{
            int c=b/a;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be executed always");
        }
    }
}
