import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter pw = new PrintWriter(new File("output.txt"));
        ) {
            int mx = 0;
            for (; sc.hasNextLine(); ) {
                String line = sc.nextLine();
                if (line.matches("^-?\\d+$")) {
                    mx = Math.max(mx, Integer.parseInt(line));
                }
            }
            pw.println(mx);
        } catch (Exception e) { }
    }
}
//3
