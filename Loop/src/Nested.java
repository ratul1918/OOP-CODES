import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        int rows;
        int cols;
        String symbol;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the rows: ");
        rows= scanner.nextInt();
        System.out.println("Enter the cols: ");
        cols=scanner.nextInt();
        System.out.println("Enter Symbol: ");
        symbol=scanner.next();

        for (int i=0;i<=rows;i++){
            System.out.println();
            for(int j=0;j<=cols;j++){
                System.out.print(symbol);
            }
        }
    }
}
