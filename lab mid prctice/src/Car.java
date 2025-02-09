public class Car {
    public double distance;
    public double fuel;

    public Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;

    }

    public double getMileage(double distance, double fuel) {
        return distance / fuel;
    }

    public double getCost(double fuel) {
        double cost = fuel * 4;
        return cost;
    }

    public void getAverage(int[] weeklyCosts) {
        int maxCost = weeklyCosts[0];
        for (int cost : weeklyCosts) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }


    }
}