public class Multi_catch {
    public static void main(String[] args) {
        try {
            int i = 9 / 0;

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
