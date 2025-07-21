package ex_19_Abstraction;

public class Lab_092_extensionof91 {
    public static void main(String[] args) {
        c2 cc=new c2();
        cc.display();
    }
}
interface model{
    void model();
}
class c2 extends Vehicle1 implements tyre,gear,model{
    void display(){
        startEngine();
        stopEngine();
        gear();
        blacktyre();
        model();
    }
    @Override
    void stopEngine() {
        System.out.println("Stop");
    }

    @Override
    public void gear() {
        System.out.println("Gear");
    }

    @Override
    public void model() {
        System.out.println("2025");
    }

    @Override
    public void blacktyre() {
        System.out.println("MRF");
    }
}