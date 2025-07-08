package ex_11_Strings;

public class Lab_049_StringInterview {
    public static void main(String[] args) {
        String s="Balu";
        char c=s.charAt(3);   // To fetch individual character from string.
        System.out.println(c);
        //---------

        System.out.println(s.codePointAt(2)); // To fetch the index value in the string.
        //----------

        //CompareToIgnore function always returns INTEGER value.
        // It returns 0 if it's TRUE
        int result=s.compareTo("balu");
        int result1=s.compareToIgnoreCase("balu");
        System.out.println(result);
        System.out.println(result1);

        //----------

        int idx="Balaji".indexOf("j"); //INDEX OF fucntion gives index position in integer value
        System.out.println(idx);

        int idx1="Navya".indexOf("v",0,2);
        System.out.println(idx1);

        int idx2="Sowkhya".lastIndexOf("a");
        System.out.println(idx2);

        //-------------

        String s11=String.join("-","Balu","Navya","Sowkhya","Shaarvi");
        System.out.println(s11);

        //---------------

        String s12="Balaji".replace("a","u");
        System.out.println(s12); //Buluji

        //---------

        boolean s13="Balaji".startsWith("Ba");
        System.out.println(s13);
    }
}
