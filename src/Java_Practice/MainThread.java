package Java_Practice;

public class MainThread {
    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println("Thrtead"+t);
        t.setName("Swapno");
        System.out.println("After changing "+t);
        for(int i=1;i<=10;++i)
        {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
