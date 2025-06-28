package ex_07_ForLoop;

public class Lab_035_Forloop_7 {
    public static void main(String[] args) {
        //Print even & odd number from 1 to 50 using continue
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("Even->"+i);
                continue;

            }
            System.out.println("Odd->"+i);
        }
    }
}
