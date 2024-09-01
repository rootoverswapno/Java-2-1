package Java_Practice;
class newThread implements Runnable
{
     int run;
    Thread t;
   newThread(int run){
       t=new Thread(this,"main thread");
       this.run=run;
       t.start();

   }
    @Override
    public void run() {
       for(int i=0;i<5;++i)
       {
           System.out.println(run+" Child thread "+i);
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
        System.out.println("Exiting child Thread " +run);
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        System.out.println("Main thread Started");
      newThread obj1=  new newThread(1);
        newThread obj2=  new newThread(2);

        System.out.println("Thread 1 is Alive "+obj1.t.isAlive());
        System.out.println("Thread 2 is Alive "+obj2.t.isAlive());
        try {
            obj1.t.join();
            obj2.t.join();
   } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread Exited");
        System.out.println("Thread 1 is Alive "+obj1.t.isAlive());
        System.out.println("Thread 2 is Alive "+obj2.t.isAlive());
    }
}
