import java.io.*;
import java.io.InterruptedIOException;
public class ThreadSleep implements Runnable {


    @Override
    public void run() {
        int i = 0;
        while (i<=10) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(300);

            }catch(InterruptedException e) {
                System.out.println(e);

            }
        }
    }
    public static void main(String[] args) {
        ThreadSleep t = new ThreadSleep();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted: " + e.getMessage());
        }

        System.out.println("Thread execution complete.");
    }

}
