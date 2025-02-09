import java.util.*;

class ApplianceTest {
    public static void main(String[] args) {
        // task-1: create an empty arrayList of "Appliance" type
        ArrayList<Appliance> ar = new ArrayList<>();

        /* task-2: add the following appliances into the list
         * "Television", "Entertainment", 150
         * "Washing machine", "Laundry", 2000
         * "Refrigerator", "Kitchen", 100
         */
        ar.add(new Appliance("Television", "Entertainment", 150));
        ar.add(new Appliance("Washing machine", "Laundry", 2000));
        ar.add(new Appliance("Refrigerator", "Kitchen", 100));

        // task-3: Find the "kitchen" appliances from the list and print their details
        for (Appliance a : ar) {
            if (a.category.toLowerCase().equals("kitchen")) {
                System.out.println(a);
            }
        }

        /* task-4: Sort the list based on their power consumption in descending
         * order. You must use comparator or comparable interfaces for
         * comparing objects of Appliance type and sort method of Collections
         * class
         */
        Collections.sort(ar, new Comparator<Appliance>() {
            public int compare(Appliance a, Appliance b) {
                return Double.compare(b.powerConsumption, a.powerConsumption);
            }
        });

        /* task-5: Now that you have a sorted list, print the details of the
         * appliances with highest and lowest power consumption
         */
        System.out.println(ar.getFirst());
        System.out.println(ar.getLast());
    }
}
