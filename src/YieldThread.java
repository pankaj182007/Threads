public class YieldThread {
    public static void main(String[] args) {
        String n[]={"pankaj","rahul","amit","rinku","sonu"};
        YieldThreadDemo ytd=new YieldThreadDemo();
        Thread t=new Thread(ytd);
        t.start();


        for (String i:n) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}

class YieldThreadDemo implements Runnable
{
    String n[]={"pankaj","rahul","amit","rinku","sonu"};
    @Override
    public void run() {
        Thread.yield();
        for (String i:n) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
