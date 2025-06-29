package Task;

public class Task25thMay_VowelsConsonants {
    public static void main(String[] args) {
        String b="Balu";
        int vowels=0; int consonants=0;
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            if("aeiou".indexOf(ch)!=-1)
                vowels++;
            else
                consonants++;

        }
        System.out.println("Vowels count is:\t"+vowels);
        System.out.println("Consonants count is:\t"+consonants);
    }
}
