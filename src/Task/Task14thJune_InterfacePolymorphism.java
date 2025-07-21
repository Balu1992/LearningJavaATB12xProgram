package Task;

public class Task14thJune_InterfacePolymorphism {
    public static void main(String[] args) {
        Guitar g=new Guitar();
        g.play();
        Piano p=new Piano();
        p.play();
    }
}
interface Playable{
    void play();
}
class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Piano");
    }
}