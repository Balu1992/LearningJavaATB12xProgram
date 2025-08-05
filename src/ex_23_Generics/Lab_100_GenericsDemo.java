package ex_23_Generics;

public class Lab_100_GenericsDemo {
    public static void main(String[] args) {
        sum(1,2);
        sum("Balu","Navya");

    }
    static <B> B sum(B a, B b){
        System.out.println(a+""+b);
        return null;
    }
}

