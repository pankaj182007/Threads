public class ThreadDemo {
    public static String tr1 = "thread1";
    public static String tr2 = "thread2";


    public static void main(String[] args) {

        System.out.println("pankaj");


        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();


    }

    public static class Thread1 extends Thread {
        public void run() {
            synchronized (tr1) {
                System.out.println("Lock01 have been taken by tread01" );
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }

                synchronized (tr2) {

                    System.out.println("Loock01 :: THEAD 001");
                }
            }
        }
    }

    public static class Thread2 extends Thread
    {
        public void run()
        {
            synchronized (tr2)
            {
                System.out.println(" Lock02 have been taken by tread2");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);;
                }

                synchronized (tr1)
                {
                    System.out.println("Loock01 :: THEAD 001");
                }
            }
        }
    }

}




