
// Question: Write a Java program to handle ArrayIndexOutOfBoundsException, InputMismatchException, and general exceptions when inserting a value into an array based on user input.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");

        int n = scanner.nextInt();
        int[] myArray = new int[n];

        try {
            System.out.println("Enter Index positon: ");
            int index = scanner.nextInt();
            System.out.println("Enter value: ");
            int value = scanner.nextInt();
            myArray[index] = value;
            System.out.println("Value inseeted");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayinndexoutofbounds occurs");
        } catch (InputMismatchException e) {
            System.out.println("input miss match exception");
        } catch (Exception e) {
            System.out.println("Others excption happens");
        } finally {
            System.out.println("Fck");
        }
    }
}

