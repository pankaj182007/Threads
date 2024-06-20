class JoinThreadDemo implements Runnable
{
    public  int[] a = {1, 2, 3, 4, 5};
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().isInterrupted());
      //  System.out.println( Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        for(int i:a)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Catch Block Running : "+Thread.currentThread().getName()+" : "+e);
            }
        }
    }
}

public class JoinThread {
    public static int[] a = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        JoinThreadDemo jtd=new JoinThreadDemo();
        Thread t=new Thread(jtd);

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i:a)
        {

            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }


}
