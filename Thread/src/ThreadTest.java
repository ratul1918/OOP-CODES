public class ThreadTest extends Thread {

    @Override
    public void run() {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
       Thread t1=new ThreadTest();
       Thread t2=new ThreadTest();
       Thread t3=new ThreadTest();
       t1.start();
       t2.start();
       t3.start();

    }
}
