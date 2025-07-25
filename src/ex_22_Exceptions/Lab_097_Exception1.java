package ex_22_Exceptions;

public class Lab_097_Exception1 {
    public static void main(String[] args) {
        int a=0;
        try {
            a=10/0;
        }
        catch (Exception e){
            System.out.println("Excepetion caught and msg is:"+e.getMessage());
        }
    }
}
