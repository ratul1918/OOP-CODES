public class Dimension {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "CarA";
        cars[0][1] = "CarB";
        cars[0][2] = "CarC";
        cars[1][0] = null;  // optional: can be set if needed
        cars[1][1] = "CarD";
        cars[1][2] = "CarE";
        cars[2][0] = "CarF";
        cars[2][1] = "CarG";
        cars[2][2] = "CarH";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print((cars[i][j] != null ? cars[i][j] : "null") + " ");
            }
        }
    }
}
