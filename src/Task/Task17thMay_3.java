package Task;

public class Task17thMay_3 {
    public static void main(String[] args) {
        int age=18;
        String result=age>18?(age>65?"Senior":(age>18||age<65?"Adult":"")):"Minor";
        System.out.println(result);
    }
}
