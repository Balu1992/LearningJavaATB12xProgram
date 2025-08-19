package Task.Task24thJune;

public class Task24thJune_InvertedPyramid {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int j=num-i;j>=1;j--) {
                System.out.print(" ");}
            for(int k=(2*i-1);k>=1;k--){
                System.out.print("*");}
            System.out.println();
        }

        int num1=4;
        int i=num1;
        while(i>=1){
            int j=num-i;
            int k=(2*i-1);
            while(j>=1){
                System.out.print(" ");
                j--;}
            while(k>=1){
                System.out.print("*");
                k--;
            }
            System.out.println();
            i--;
        }
    }
}
