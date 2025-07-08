package ex_11_Strings;

public class Lab_051_Substring {
    public static void main(String[] args) {
        String s1="Balaji".substring(2);
        System.out.println(s1);

        String s2="Navya".substring(1,3);
        System.out.println(s2);

        char[] c="Sowwkhya".toCharArray();
        System.out.println(c); //['S'.'o',.....]

        String s3="   Balaji         ".trim();
        System.out.println(s3);

        boolean s4="       ".isBlank();
        System.out.println(s4); //true

        String s5="Balu".repeat(3);
        System.out.println(s5);

        String s6=String.format("%s=%d","age",25);
        System.out.println(s6);
    }
}
