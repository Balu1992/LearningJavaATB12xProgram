package Task;

public class Task31stMay_Firstletterofeachword {
    public static void main(String[] args) {
        String s="Hello Balaji and navya";
        //System.out.println(s.charAt(0));
        String[] s1=s.split(" ");
        System.out.println("First letters are:");
        for(String word:s1){
            if(!word.isEmpty()){
                System.out.println(word.charAt(0));
            }
        }
    }
}
