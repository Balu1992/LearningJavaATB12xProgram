package Task;

public class Task1stJune_SmallestElementinArray {
    public static void main(String[] args) {
        int[] b={2,34,55,1,0,-1};
        int smallest=0;
        int num=0;
        for(int b1:b){
            if(b1<smallest){
                smallest=b1;
                b1=num;
            }else if(b1>num){
                smallest=num;
            }
        }
        System.out.println("Smallest Number in array is:"+smallest);
    }
}
