package multiThreading;

class MovieTicketBook {

    int ticket = 10;

    //  synchronized
    public void tBook(int t) {
        if (t <= ticket) {
            System.out.println("tickt booked succefully " + t);
            ticket -= t;
            System.out.println("remaning ticket " + ticket);

        } else {
            System.out.println("sorry ticket did not book ");
            System.out.println("remaning ticket " + ticket);

        }
    }
}


    

public class Syncho_method extends Thread {

    int t;
    static MovieTicketBook m;

    @Override
    public void run() {
        m.tBook(t);
    }

    public static void main(String args[]) {
        m = new MovieTicketBook();
        Syncho_method m1 = new Syncho_method();
        Syncho_method m2 = new Syncho_method();
        m1.t = 7;
        m2.t = 6;
        m1.start();
        m2.start();

    }
}
