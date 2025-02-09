public class Appliance {
    String name, category;
    double powerConsumption; // watt

    Appliance(String n, String c, double d) {
        name = n;
        category = c;
        powerConsumption = d;
    }

    public String toString() {
        return name + " " + category + " " + powerConsumption;
    }
}