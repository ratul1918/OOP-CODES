
// Question: Write a Java program that demonstrates handling of FileNotFoundException 
// and ArithmeticException using try-catch blocks, and includes a finally block.

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excption {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        try {
            int a = 100;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException done");
        } finally {
            System.out.println("Wow finally done");
        }
    }
}
