package ex_12_Arrays;

public class Lab_064_2DArrays {
    public static void main(String[] args) {
        int[][] array_2d={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        array_2d[0][0]=1;
        array_2d[0][1]=2;
        array_2d[0][2]=3;

        System.out.println(array_2d[0][2]);
    }
}
