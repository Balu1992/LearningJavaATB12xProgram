package ex_04_Operators;

public class Lab019_AcceptingUserInput_CLI {
    public static void main(String[] args) {
    String res=args[0];
        System.out.println(res instanceof String);
        System.out.println(res);
        int age=Integer.parseInt(res);
        System.out.println(age);
    }
}
