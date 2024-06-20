public class TowThread {


    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        Thread t1 = new Thread() {


            @Override
            public void run() {
                synchronized (a) {

                    for (int i = 1; i <= 10; i++) {
                        System.out.println("i am thread A");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {

                        }
                    }
                    System.out.println("Exit thread A");

                }
            }

        };


        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (b) {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("I am thread B");
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {

                        }

                    }
                    System.out.println("Exit thread b");

                }
            }
        };
        t1.start();
        t2.start();

    }
}

