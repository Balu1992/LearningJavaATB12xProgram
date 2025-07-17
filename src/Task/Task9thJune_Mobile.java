package Task;

public class Task9thJune_Mobile {
    String brand;
    double price;

    Task9thJune_Mobile(String b){
        this.brand=b;
    }
    Task9thJune_Mobile(String b1,double p1){
        this.brand=b1;
        this.price=p1;
    }

    public static void main(String[] args) {
        Task9thJune_Mobile t=new Task9thJune_Mobile("Nokia");
        System.out.println(t.brand);
        Task9thJune_Mobile t1=new Task9thJune_Mobile("Samsung",12000);
        System.out.println(t1.brand);
        System.out.println(t1.price);
    }
}
