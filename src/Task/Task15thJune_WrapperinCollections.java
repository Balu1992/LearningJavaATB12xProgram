package Task;

import java.util.ArrayList;

public class Task15thJune_WrapperinCollections {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.addFirst(30);
        System.out.println("Elements in num arraylist is:"+num);
        System.out.println(num.contains(10));
    }
}
