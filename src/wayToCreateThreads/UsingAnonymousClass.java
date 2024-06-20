package wayToCreateThreads;

public class UsingAnonymousClass {
    public static void main(String[] args) {

        //This is Anonymous Class
        Runnable runnable= new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };

        Thread thread=new Thread(runnable);
        thread.start();

    }
}
