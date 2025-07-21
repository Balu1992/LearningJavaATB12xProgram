package Task;

public class Task14thJune_InterfaceConstants {
    public static void main(String[] args) {
        car3 c=new car3();
        c.display();
    }
}
interface SpeedLimit{
    static int MAX_SPEED=120;
}
class car3 implements SpeedLimit{
    void display(){
        System.out.println("Max Speed is:"+MAX_SPEED);
    }
}
