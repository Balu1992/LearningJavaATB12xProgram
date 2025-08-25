package Task.Task10thJuly.Task5;

public class Utility {
    public void max(int a, int b){
        if(a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
    }
    public void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+" is greater");
        } else if (b>c && b>a) {
            System.out.println(b+" is greater");
        }else{
            System.out.println(c+" is greater");
        }
    }
    public void max(double a, double b){
        if(a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
    }
}
