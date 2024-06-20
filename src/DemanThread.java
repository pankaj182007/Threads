public class DemanThread
{
    public static void main(String[] args) {
        DemanDemo dd=new DemanDemo();
        Thread t=new Thread(dd);
        t.setDaemon(true);
        t.start();
    }
}
class DemanDemo implements Runnable
{

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon())
        {
            System.out.println("It is Deman Thread ");
        }else {
            System.out.println("It is Simpale Thread");
        }
    }
}
