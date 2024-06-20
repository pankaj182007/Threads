package executorServiceInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TriggerClass {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=0; i<=10;i++)
        {
            Runnable runnable=new MyRunnable("Thread "+i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (!executorService.isTerminated())
        {

        }

        System.out.println("successfully Done ----------------------");

    }
}
