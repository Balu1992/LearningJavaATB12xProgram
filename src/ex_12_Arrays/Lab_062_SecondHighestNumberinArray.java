package ex_12_Arrays;

public class Lab_062_SecondHighestNumberinArray {
    public static void main(String[] args) {
        int[] a={100,30,65,92};
        int highest=0;
        int sec_high=0;
        for(int num:a){
            if(num>highest){
                sec_high=highest;
                highest=num;
            }else if(num>sec_high && num != highest){
                sec_high=num;
            }
        }
        System.out.println(sec_high);
    }
}
