package Task;

public class Task9thJune_RectangleArea {
    int length;
    int breadth;
    int area;

    Task9thJune_RectangleArea(int l,int b){
        this.length=l;
        this.breadth=b;
        area=l*b;
    }
    void result(){
        System.out.println("Area of rectangle is:"+area);
    }

    public static void main(String[] args) {
        Task9thJune_RectangleArea r=new Task9thJune_RectangleArea(20,30);
        r.result();
    }
}
