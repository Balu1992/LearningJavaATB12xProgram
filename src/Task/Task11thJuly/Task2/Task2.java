package Task.Task11thJuly.Task2;

class Task2 {
  void sound(){
      System.out.println("Animal sound");
  }
}
class t1 extends Task2{
    @Override
    void sound() {
        super.sound();
        System.out.println("Some another sound");
    }


public static void main(String[] args) {
        t1 t=new t1();
        t.sound();
    }
}

