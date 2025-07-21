package Task;

public class Task14thJune_Bank {
    public static void main(String[] args) {
        SBI s=new SBI();
        s.getInterestRate();
        HDFC h=new HDFC();
        h.getInterestRate();
    }
}
abstract class Bank{
    abstract void getInterestRate();
}
class SBI extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("SBI Interest Rate:6.5%");
    }
}
class HDFC extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("HDFC Interest Rate:7.0%");
    }
}
