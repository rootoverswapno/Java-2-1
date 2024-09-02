package NKP_ALL_LAB_Problem;
interface Playable
{
    void play();
}

 abstract class Instrument{
    abstract void sound();
    void tune()
    {
        System.out.println("Tuning the instrumnent");
    }

 }
 class guiter extends Instrument implements Playable{

     @Override
     public void play() {
         System.out.println("Playing the guitar");
     }

     @Override
     void sound() {
         System.out.println("strum strum");
     }
 }
public class Problem_18{
    public static void main(String[] args) {
        guiter mgtr=new guiter();
        mgtr.tune();
        mgtr.play();
        mgtr.sound();
    }
}
