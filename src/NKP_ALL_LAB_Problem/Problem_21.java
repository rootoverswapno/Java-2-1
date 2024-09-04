package NKP_ALL_LAB_Problem;
class mythread extends Thread{
private String threadno;
mythread(String name)
{
    threadno=name;
}
public void run()
{
    for(int i=1;i<=5;++i)
    {
        System.out.println(threadno+"  count  "+i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    System.out.println("Finis exiting");
}
}
public class Problem_21 {
    public static void main(String[] args) {
        mythread thread1=new mythread("Thread 1");
        mythread thread2=new mythread("Thread 2");

        thread1.start();
        thread2.start();
        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());

    }
}
