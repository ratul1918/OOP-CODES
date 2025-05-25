import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        int rows;       // Number of rows for the pattern
        int cols;       // Number of columns for the pattern
        String symbol;  // Symbol to be printed

        Scanner scanner = new Scanner(System.in);  // Scanner for user input

        // Taking user input for number of rows
        System.out.println("Enter the rows: ");
        rows = scanner.nextInt();

        // Taking user input for number of columns
        System.out.println("Enter the cols: ");
        cols = scanner.nextInt();

        // Taking user input for the symbol to be used in the pattern
        System.out.println("Enter Symbol: ");
        symbol = scanner.next();

        // Outer loop for each row
        for (int i = 0; i <= rows; i++) {
            System.out.println(); // Move to the next line

            // Inner loop for each column in the current row
            for (int j = 0; j <= cols; j++) {
                System.out.print(symbol); // Print the symbol without newline
            }
        }
    }
}
