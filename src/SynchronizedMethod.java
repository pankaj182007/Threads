public class SynchronizedMethod {

    public static void main(String[] args) {


        SynchronizedMethodDemo smd1=new SynchronizedMethodDemo();
        smd1.seatbooking =7;
        Thread t1=new Thread(smd1);
        t1.start();

        SynchronizedMethodDemo smd2=new SynchronizedMethodDemo();
        smd2.seatbooking =6;
        Thread t2=new Thread(smd2);
        t2.start();
    }
}

class SynchronizedMethodDemo implements Runnable
{
      static SeatBookingApp sba=new SeatBookingApp();
   int seatbooking;

    @Override
    public void run() {
        sba.bookSeat(seatbooking);

    }
}

class SeatBookingApp
{
       int seat=10;

 synchronized  void bookSeat(int seats)
 {

     if (seat>=seats)
     {
         System.out.println(Thread.currentThread().getName());

         System.out.println("Total seats : "+seat);
         seat=seat-seats;
         System.out.println("Your "+seats+" seats Booked");
         System.out.println("Remaining Seats are : "+seat);
     }
     else {
         System.out.println(Thread.currentThread().getName());

         System.out.println("Remaining seats : "+seat);
         System.out.println("your : "+seats+" seats are not booked");
     }


 }
}
