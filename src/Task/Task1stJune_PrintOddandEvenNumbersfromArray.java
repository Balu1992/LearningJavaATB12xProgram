package Task;

public class Task1stJune_PrintOddandEvenNumbersfromArray {
    public static void main(String[] args) {
        int[] d={3,6,23,12,27 };
        System.out.println(odd_even_fromarray(d));
    }
    static int odd_even_fromarray(int[] d){
        for(int i=0;i<d.length;i++){
            if(d[i]%2==0){
                System.out.println(d[i]+"is even");
            }
            else{
                System.out.println(d[i]+"is odd");
            }
        }
        return 0;
    }
}
