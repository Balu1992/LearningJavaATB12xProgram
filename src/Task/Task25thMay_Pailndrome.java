package Task;

public class Task25thMay_Pailndrome {
    public static void main(String[] args) {
        String b="madam";
        int start=0;
        int end=b.length()-1;

        while(start < end){
            if(b.charAt(start) !=b.charAt(end)){
                System.out.println("not a palindrome");
                break;
            }
            start++;
            end--;
        }
        if(start==end){
            System.out.println("It's a palindrome");
        }
    }
}
