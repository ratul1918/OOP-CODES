public class Movie {
    public static void main(String[] args) {
        MovieTheater m = new MovieTheater(15);
        User mina = new User(m, 6, "Mina");
        User nabil = new User(m, 8, "Nabil");
        User farhan = new User(m, 4, "Farhan");

        mina.start();
        nabil.start();
        farhan.start();

        try {
            mina.join();
            nabil.join();
            farhan.join();
            System.out.println("Available tickets: " + m.availableSeats);
        } catch (InterruptedException e) { }
    }
}
