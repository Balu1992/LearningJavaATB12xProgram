package Task;

public class Task1stJune_SumofallItemsinArray {
    public static void main(String[] args) {
        int[] c={33,50,10,100};
        System.out.println("Sum of all elements in an array is:"+sum_of_all(c));
    }
    static int sum_of_all(int[] c){
        int sum=0;
        for(int i=0;i<c.length;i++){
            sum=sum+c[i];
        }
        return sum;
    }
}
