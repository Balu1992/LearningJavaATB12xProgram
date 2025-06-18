package Task;

public class Task18thMay_2 {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a); //11

        System.out.println("b=" + b); //22

        System.out.println("c=" + c); //11+22+11+22+13+24 = 103
    }
}
