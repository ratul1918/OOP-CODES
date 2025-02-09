public class User extends Thread {
    MovieTheater m;
    int NumOfTickets;

    User(MovieTheater m, int NumOfTickets, String name) {
        super(name);
        this.m = m;
        this.NumOfTickets = NumOfTickets;
    }

    @Override
    public void run() {
        int booked = m.bookTickets(this.NumOfTickets);
        System.out.printf("%s has booked %d tickets\n", this.getName(), booked);
    }
}
