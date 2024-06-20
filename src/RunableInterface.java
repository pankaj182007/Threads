public class RunableInterface {

    public static void main(String[] args) {
        RunableInterfaceThread rit=new RunableInterfaceThread();
        Thread t=new Thread(rit);
        t.start();
    }
}


class RunableInterfaceThread implements Runnable
{
    @Override
    public void run()
    {

        for (int i=1; i<=10;i++)
        {
            System.out.println(i+" : I am Runable Interface Thread");
        }

    }


}
