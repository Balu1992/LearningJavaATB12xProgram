package ex_07_ForLoop;

public class Lab_034_Forloop_6 {
    public static void main(String[] args) {
        // To print even and odd numbers from 1 to 50
        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println(i+"\t is Even number");
            }
            else {
                System.out.println(i+"\t is Odd number");
            }
        }
    }
}
