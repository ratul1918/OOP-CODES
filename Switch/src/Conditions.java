import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("You are playing game! press Q or q to quit!!");
        String response =scanner.next();
        //logical or checking
        if (response.equals("q") || response.equals("Q")){
            System.out.println("Quit the game");
        }
        else {
            System.out.println("You are playing the game pew pew");
        }

        //not equal checking


        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are playing the game pew pew");
        }
        else {
            System.out.println("Quit the game");
        }
    }
}
