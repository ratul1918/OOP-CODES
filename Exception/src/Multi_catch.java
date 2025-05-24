// Question: Write a Java program that demonstrates the use of multiple catch blocks and a finally block.

public class Multi_catch {
    public static void main(String[] args) {
        try {
            int i = 9 / 0;  // This will throw ArithmeticException
            System.out.println(i);
        }
        catch (ArithmeticException e){
            System.out.println("Ar exception");
        }
        catch (Exception e2){
            System.out.println("E2 excpetion");
        }
        finally {
            System.out.println("finally");
        }
    }
}
