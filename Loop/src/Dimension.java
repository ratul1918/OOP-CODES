public class Dimension {
    public static void main(String[] args) {
        String[][] cars= new String[3][3];
        cars[0][0]="Shiiiit";
        cars[0][1]="Shlllllit";
        cars[0][2]="Shjjjit";
        cars[1][1]="Shjjjjit";
        cars[1][2]="Shiiiit";
        cars[2][0]="Shiuuuut";
        cars[2][1]="Shiuuut";
        cars[2][2]="Ssssssshit";

        for (int i=0;i<cars.length;i++){
            System.out.println();
            for (int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}
