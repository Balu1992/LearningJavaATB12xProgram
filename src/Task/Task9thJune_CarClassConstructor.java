package Task;

public class Task9thJune_CarClassConstructor {
    String brand;
    int model;
    int price;

    Task9thJune_CarClassConstructor(String b1,int m1,int p1){
        this.brand=b1;
        this.model=m1;
        this.price=p1;
    }
    void display(){
        System.out.println("Brand Name is:"+brand);
        System.out.println("Model is:"+model);
        System.out.println("Price is:"+price);
    }

    public static void main(String[] args) {
        Task9thJune_CarClassConstructor c=new Task9thJune_CarClassConstructor("Volvo",2020,120000);
        c.display();
    }
}
