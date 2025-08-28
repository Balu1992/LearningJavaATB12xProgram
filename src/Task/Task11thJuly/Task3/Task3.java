package Task.Task11thJuly.Task3;

class Task3 {
    int a=10;
}
class t3 extends Task3{
    t3(){
        System.out.println("Value of a is:"+super.a);
    }


public static void main(String[] args) {
        t3 t=new t3();
    }
}