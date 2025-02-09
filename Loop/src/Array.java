public class Array {
    public static void main(String[] args) {
        String[] car={"cmero","tesla","Bmw"};

        car[0]= "Mustang";

        System.out.println(car[2]);

        //new way
        String[] cars= new String[3];

        cars[0]="Cam";
        cars[1]="Caam";
        cars[2]="Camm";

        for(int i=0;i<=cars.length;i++){
            System.out.println(cars[i]);
        }

    }
}
