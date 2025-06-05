public class tes {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 2, 0, -1};
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            {
                if (num[i] < min)
                    min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Min is:"+min);
        System.out.println("Max is:"+max);
    }
}
