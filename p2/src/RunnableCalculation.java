class SumOdd implements Runnable {
    int sum = 0;

    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            sum += i;
        }
    }

    public int getSum() {
        return sum;
    }
}

class SubEven implements Runnable {
    int sum = 0;

    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            sum -= i;
        }
    }

    public int getSum() {
        return sum;
    }
}

public class RunnableCalculation {
    public static void main(String[] args) {
        SumOdd oddRunnable = new SumOdd();
        SubEven evenRunnable = new SubEven();

        Thread oddThread = new Thread(oddRunnable);
        Thread evenThread = new Thread(evenRunnable);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = oddRunnable.getSum() + evenRunnable.getSum();
        System.out.println("Final Result: " + result);
    }
}
