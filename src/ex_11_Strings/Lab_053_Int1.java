package ex_11_Strings;

public class Lab_053_Int1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");
        sb.append("Programming");
        System.out.println(sb);
        sb.delete(5,16);
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
