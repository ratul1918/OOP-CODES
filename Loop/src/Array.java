public class Array {
    public static void main(String[] args) {
        // Declaring and initializing an array with values
        String[] car = {"cmero", "tesla", "Bmw"};

        // Updating the first element of the array
        car[0] = "Mustang";

        // Printing the third element of the array
        System.out.println(car[2]);  // Output: Bmw

        // Declaring an empty array of size 3
        String[] cars = new String[3];

        // Assigning values to the array elements
        cars[0] = "Cam";
        cars[1] = "Caam";
        cars[2] = "Camm";

        // Loop to print all elements in the array
        // FIXED: Use i < cars.length instead of i <= cars.length to avoid ArrayIndexOutOfBoundsException
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
