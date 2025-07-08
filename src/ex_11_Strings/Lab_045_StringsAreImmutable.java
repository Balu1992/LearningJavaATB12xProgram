package ex_11_Strings;
// Immutable means it cannot be divided further
public class Lab_045_StringsAreImmutable {
    public static void main(String[] args) {
        String s1="Balu"; // This will be created in SCP(String Constant Pool)
        s1.toUpperCase(); // This will create BALU
        System.out.println(s1); // This will print Balu instead of BALU
        // It is because of immutable nature of strings.
        // Balu & BALU are the two strings which will be created in SCP.
    }
}
