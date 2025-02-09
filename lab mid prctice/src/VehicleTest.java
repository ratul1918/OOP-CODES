import java.util.Scanner;
public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance travelled and fuel consumption of the car:");
        double distance = scanner.nextDouble();
        double fuel = scanner.nextDouble();

        Car car = new Car(distance, fuel);

        System.out.println("Please enter a choice: 1. Mileage of Car 2. Cost of fuel 3. Maximum Cost");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Mileage of the Car: " + car.getMileage(400,40.4) + " km/l");
                break;
            case 2:
                System.out.println("Fuel Cost: $" + car.getCost(122));
                break;
            case 3:
                System.out.println("Enter fuel costs for the last 4 weeks:");
                int[] weeklyCosts = new int[4];
                for (int i = 0; i < 4; i++) {
                    weeklyCosts[i] = scanner.nextInt();
                }
                car.getAverage(weeklyCosts);
                break;
            default:
                System.out.println("Invalid choice. Please choose between 1, 2, or 3.");
        }

        scanner.close();
    }
}