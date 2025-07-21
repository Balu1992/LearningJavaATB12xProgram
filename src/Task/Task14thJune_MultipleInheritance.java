package Task;

public class Task14thJune_MultipleInheritance {
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
        d.show();
    }
}
interface Printable{
    void print();
    void show();
}
interface Showable{
    void print();
    void show();
}
class Document implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    @Override
    public void show() {
        System.out.println("Showing Document");
    }
}