package Task;

public class Task31stMay_CountNumberofWords {
    public static void main(String[] args) {
        String s="Hello Balaji";
        s=s.replaceAll("a-zA-Z"," ");
        String[] s1=s.split(" ");
        System.out.println("Number of words is:"+s1.length);
        }
}
