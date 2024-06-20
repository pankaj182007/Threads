public class InterruptThread {
    public static void main(String[] args) {

    InterruptThreadDemo itd=new InterruptThreadDemo();
    Thread t=new Thread(itd);
    t.start();
    t.interrupt();
        try {
        for (int j = 1; j <=5 ; j++) {
            System.out.println(Thread.currentThread().getName() + " : " + j);

            Thread.sleep(1000);
        }
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " : " + e);

            }
        }
}

class InterruptThreadDemo implements Runnable
{



    @Override
    public void run() {

        System.out.println(Thread.currentThread().isInterrupted());
        //System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            Thread.sleep(1000);
        }
            }catch (Exception e)
            {
                System.out.println(Thread.currentThread().getName()+" : "+e);
                e.printStackTrace();
                System.out.println(Thread.currentThread().isInterrupted());
                //Thread.currentThread().stop();
            }


        }
    }

