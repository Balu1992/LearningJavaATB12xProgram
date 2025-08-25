package Task.Task10thJuly.Task2_Printdata;

public class UniversalPrinter {
    public static void main(String[] args) {
        Printer p=new Printer();
        System.out.println("Int data is:"+p.printData(12));
        System.out.println("Float data is:"+p.printData(1));
        System.out.println("String data is:"+p.printData("Balu"));
    }
}
