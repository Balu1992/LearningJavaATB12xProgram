package Task;

public class Task18thMay_3 {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m); //i=1,j=2,k=3,m=-4
    }
}
