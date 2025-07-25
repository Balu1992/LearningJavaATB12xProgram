package Task;

import java.util.Scanner;

public class Task17thJune_Maximumof2nos {
    public static void main(String[] args) {
        int n=max_2_nos(20,92);
        System.out.println(n+" is maximum number");

    }
    static int max_2_nos(int first,int second){
        if(first>second)
            return first;
        else
            return second;
    }
}
