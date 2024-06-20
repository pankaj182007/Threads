public class StaticSynchronised {
    public static void main(String[] args) {
        BookSeats bs= new BookSeats();
        BookTheaterSeat bts=new BookTheaterSeat(bs,7);
        Thread t1=new Thread(bts);
        t1.start();

        BookSeats bs1= new BookSeats();
        BookTheaterSeat bts1=new BookTheaterSeat(bs1,6);

        Thread t2=new Thread(bts1);
        t2.start();

    }
}

class BookTheaterSeat implements Runnable
{
    BookSeats bs;
    int seat;
    BookTheaterSeat(BookSeats bs,int seat)
    {
        this.bs=bs;
        this.seat=seat;
    }
    @Override
    public void run() {

        bs.bookSeats(seat);

    }
}

class BookSeats
{
    static int totalSeats=10;
   static synchronized void bookSeats(int seat)
   {
       if (totalSeats>seat) {
           totalSeats = totalSeats - seat;
           System.out.println("Your " + seat + " are booked");
           System.out.println("Remaining seats " + totalSeats);
       }else {
           System.out.println("Your " + seat + " are not booked");

           System.out.println("total seats are "+totalSeats);

       }

    }
}
