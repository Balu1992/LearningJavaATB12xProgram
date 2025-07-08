package ex_11_Strings;

public class Lab_048_StringInterview {
    public static void main(String[] args) {
        String a="Balu";
        String b="Balu"; //points to same reference in SCP

        String c=new String("Balu");
        String d=new String("Balu");// Creates two new objects in OBJECT AREA(OA) always
        String e=new String("balu");

        // "==" operator behaves differently in strings
        // It looks for reference location instead of it's actual usage

        System.out.println(a==b); // TRUE
        System.out.println(a==c); // FALSE
        System.out.println(c==d);//FALSE

        // "equals" function checks for the content between two references.

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
        System.out.println(a.equals(e));
        System.out.println(a.equalsIgnoreCase(e));
    }
}
