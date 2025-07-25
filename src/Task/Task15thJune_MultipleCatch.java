package Task;

public class Task15thJune_MultipleCatch {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        int[] arr={3,2};
        try{
            int c=b/a;
            int res=arr[3]/0;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
