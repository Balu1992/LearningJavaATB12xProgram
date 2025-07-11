package ex_12_Arrays;

public class Lab_061_SumoftheArray {
    public static void main(String[] args) {
        int[] a={33,26};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of an array is:"+sum);
    }
}
