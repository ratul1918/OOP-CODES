public class Concrete {
    interface Inf1 {
        void m1();
        void m2();
    }

    interface Inf2 {
        void m3();
    }

    abstract class Abs {
        abstract public void m4();
    }

    class concrete extends Abs implements Inf1, Inf2 {
        public void m1() { System.out.println("m1"); }
        public void m2() { System.out.println("m2"); }
        public void m3() { System.out.println("m3"); }
        public void m4() { System.out.println("m4"); }
    }
}
