package ex_23_Generics;

public class Lab_101_Generics1 {
    public static void main(String[] args) {
        test t=new test(2);
        System.out.println(t.getData());
        test t1=new test("Balu");
        System.out.println(t1.getData());
        test t2=new test(3.1315);
        System.out.println(t2.getData());
    }
}
class test<T>{
    private T data;

    public test(T d){
        this.data=d;
    }

    public T getData(){
        return data;
    }
}
