public class ThreadNaming {
    public static void main(String[] args) {
        Naminge na=new Naminge();
        Thread thread=new Thread(na);
        thread.setName("Pankaj");
        thread.start();

        Thread.currentThread().setName("PankajMain");
        System.out.println(Thread.currentThread().getName());
        System.out.println(thread.isAlive());

    }
}
class Naminge implements Runnable
{

    @Override
    public void run() {
        System.out.println("Naming thread");

        System.out.println(Thread.currentThread().getName());
    }
}