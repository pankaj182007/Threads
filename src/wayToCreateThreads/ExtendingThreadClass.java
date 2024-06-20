package wayToCreateThreads;

public class ExtendingThreadClass {

    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();

    }


}


class Thread1 extends Thread
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