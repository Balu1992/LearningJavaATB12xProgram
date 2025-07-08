package ex_11_Strings;

public class Lab_052_StringBuffer_StringBuilder_1 {
    public static void main(String[] args) {

        StringBuffer sbuff=new StringBuffer("Balu");
        StringBuilder sb=new StringBuilder("Navya");

        System.out.println(sbuff.reverse());
        System.out.println(sb.reverse());

        System.out.println(sbuff.append("aa"));
        System.out.println(sb.deleteCharAt(1));
    }
}
