import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for input

        // Prompt user to enter distance and fuel used by the car
        System.out.println("Enter distance travelled and fuel consumption of the car:");
        double distance = scanner.nextDouble(); // e.g. 400
        double fuel = scanner.nextDouble();     // e.g. 40.4

        Car car = new Car(distance, fuel); // Create a Car object with distance and fuel

        // Ask user for an operation to perform
        System.out.println("Please enter a choice: 1. Mileage of Car 2. Cost of fuel 3. Maximum Cost");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Calculate mileage (example values given: 400 km and 40.4 liters)
                System.out.println("Mileage of the Car: " + car.getMileage(400, 40.4) + " km/l");
                break;
            case 2:
                // Calculate total cost based on price per unit (example: 122 per liter)
                System.out.println("Fuel Cost: $" + car.getCost(122));
                break;
            case 3:
                // Ask user to enter weekly costs for 4 weeks, then show average
                System.out.println("Enter fuel costs for the last 4 weeks:");
                int[] weeklyCosts = new int[4];
                for (int i = 0; i < 4; i++) {
                    weeklyCosts[i] = scanner.nextInt();
                }
                car.getAverage(weeklyCosts); // This method should print or return the average
                break;
            default:
                System.out.println("Invalid choice. Please choose between 1, 2, or 3.");
        }

        scanner.close(); // Close the scanner
    }
}
