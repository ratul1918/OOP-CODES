import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Initialize an empty string to store the user's name
        String name = "";

        // Loop continues until the user enters a non-blank name
        while(name.isBlank()) {
            System.out.println("Enter your name:");  // Prompt the user
            name = sc.nextLine();                   // Read user input
        }

        // Print greeting once a valid name is entered
        System.out.println("Hello " + name);
    }
}
