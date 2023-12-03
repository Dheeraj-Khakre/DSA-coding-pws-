package multiThreading;

class MovieTicketBook {

    static int ticket = 20;

    static synchronized public void tBook(int t) {
        System.out.println("..........////..........");
     //   System.out.println(Thread.currentThread().getName());

        // synchronized (this) {
        if (t <= ticket) {
            System.out.println("tickt booked succefully " + t);
            ticket = ticket - t;
            System.out.println("remaning ticket " + ticket);

        } else {
            System.out.println("sorry ticket did not book " + t);
            System.out.println("remaning ticket " + ticket);

        }
    }
    // }
}

class x extends Thread {

    MovieTicketBook m;
    int t;

    x(int t, MovieTicketBook m) {
        this.t = t;
        this.m = m;

    }

    @Override
    public void run() {
        m.tBook(t);
    }

}

class x2 extends Thread {

    MovieTicketBook m;
    int t;

    x2(int t, MovieTicketBook m) {
        this.t = t;
        this.m = m;

    }

    @Override
    public void run() {
        m.tBook(t);
    }

}

public class Synchro_Static {

    public static void main(String args[]) {
        MovieTicketBook m = new MovieTicketBook();
        MovieTicketBook m2 = new MovieTicketBook();
        x x1 = new x(7, m);
        x x2 = new x(6, m);
        x1.start();
        x2.start();

        x2 x3 = new x2(5, m2);
        x2 x4 = new x2(9, m2);
        x3.start();
        x4.start();

    }
}
