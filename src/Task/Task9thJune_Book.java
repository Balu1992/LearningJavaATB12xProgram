package Task;

public class Task9thJune_Book {
    String title,author;
    double price;

    Task9thJune_Book(String t,String a,double p){
        this.title=t;
        this.author=a;
        this.price=p;
    }
    void display(){
        System.out.println("Title is:"+title);
        System.out.println("Author is:"+author);
        System.out.println("Price is:"+price);
    }

    public static void main(String[] args) {
        Task9thJune_Book b=new Task9thJune_Book("Rigveda","Swamy chidananda",12.0);
        b.display();
    }
}
