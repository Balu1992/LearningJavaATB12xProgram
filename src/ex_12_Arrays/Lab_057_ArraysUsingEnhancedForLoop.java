package ex_12_Arrays;

public class Lab_057_ArraysUsingEnhancedForLoop {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int a1[]={4,5,6};
        int a2[]=new int[4];
        // All the above ones are valid and square bracket can be used anywhere
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

        //ENHANCED FOR LOOP
        for(int element:a1){
            System.out.println(element);
        }
    }
}
