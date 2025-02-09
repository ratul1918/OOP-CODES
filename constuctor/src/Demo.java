import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double Radius;
        double area;

        Scanner sc= new Scanner(System.in);
        Radius=sc.nextDouble();

        area=Math.PI*Radius*Radius;

        System.out.println(area);
    }
}
