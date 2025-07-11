package Task;

public class Task1stJune_PrintLargestElementinArray {
    public static void main(String[] args) {
        int[] a={25,1,33,97,100,101};
        int highest=0;
        int num=0;
        for(int a1 : a){
            if(a1>highest){
                highest=a1;
                a1=num;
            }else if(a1<highest){
                highest=num;
            }
        }
        System.out.println("Highest element in array is:"+highest);
    }
}
