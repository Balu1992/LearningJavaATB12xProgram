package ex_18_SuperKeyword;

public class Lab_089_SuperKeyword {
    public static void main(String[] args) {
        Derivedclass d=new Derivedclass();
        System.out.println(d.getA());
    }
}
class Baseclass {
    private int a = 10;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    Baseclass(int a) {
        this.a = a;
    }
    void bhk(){
        System.out.println("3 bhk");
    }
}
class Derivedclass extends Baseclass{
    public Derivedclass(){
        super(5); //Calling parent class methods
        super.getA();
        super.setA(6);
        super.bhk();
    }

}
