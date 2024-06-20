package wayToCreateThreads;

public class UsingLambdafunctionn {
    public static void main(String[] args) {

        Runnable r1=()->
        {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }



        };

        Thread thread=new Thread(r1);
        thread.start();
    }
}
