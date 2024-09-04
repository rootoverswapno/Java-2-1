package NKP_ALL_LAB_Problem;
class Mainthread extends Thread{

    String threadnum;
    Mainthread(String y)
    {
        threadnum=y;
    }

    @Override
    public void run() {
//        super.run();
        for(int i=1;i<=5;++i)
        {
            System.out.println(threadnum+"  "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Successfully Exited");
    }
}
public class Problem_22 {
    public static void main(String[] args) {
        Mainthread st1=new Mainthread("thread 1");
        Mainthread st2=new Mainthread("thread 2");
        Mainthread st3=new Mainthread("thread 3");
        st1.setPriority(Thread.MIN_PRIORITY);
        st2.setPriority(Thread.NORM_PRIORITY);
        st3.setPriority(Thread.MAX_PRIORITY);
       st1.start();
       st2.start();
       st3.start();

    }
}
