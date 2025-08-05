package ex_24_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab_102_ListandArrayList {
    public static void main(String[] args) {
        List fruits= List.of("Apple","Guava");
        System.out.println(fruits);
        
        //List contains all empty methods. So we'll use ArrayList feature for its complete features
        List aL=new ArrayList<>();
        aL.add("Mango");
        System.out.println(aL);
        aL.add("Pineapple");
        aL.contains("Mango");
        aL.addFirst("Raspberry");
        System.out.println(aL);
        System.out.println("length is:"+aL.size());
    }
}
