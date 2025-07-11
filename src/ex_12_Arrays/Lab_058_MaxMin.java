package ex_12_Arrays;

public class Lab_058_MaxMin {
    public static void main(String[] args) {
        int[] a = {20, 1, 30, 99};
        int maxi=max(a);
        int mini=min(a);
        System.out.println("Max number is:"+maxi);
        System.out.println("Min number is:"+mini);
    }
    static int max(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    static int min(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
}






