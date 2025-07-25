package Task;

public class Task15thJune_ArithmeticException {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        try{
            int c=b/a;
        }
        catch (Exception e){
            System.out.println("The exception is:"+e.getMessage());
        }
    }
}
