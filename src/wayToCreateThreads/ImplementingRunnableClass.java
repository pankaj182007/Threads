package wayToCreateThreads;

public class ImplementingRunnableClass {
    public static void main(String[] args) {
        Thread2 thread2 =new Thread2();
        Thread thread=new Thread(thread2);
        thread.start();
    }
}

class Thread2 extends Thread
{
    @Override
    public void run() {

        for (int i=0;i<=10;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}