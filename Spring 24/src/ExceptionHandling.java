import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int[] ar = new int[sc.nextInt()];

        try {
            System.out.print("Enter index position: ");
            int i = sc.nextInt();
            System.out.print("Enter value: ");
            int v = sc.nextInt();
            ar[i] = v;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred");
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        } finally {
            System.out.println("Exception handling is amazing");
        }

    }
}