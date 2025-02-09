
import java.io.*;

public class StudentiDProcessor {
    public static void main(String[] args) {
        String filename = "id.txt";
        int cseCount = 0, eeeCount = 0;
        String maxBBAId = "";
        int maxBBAValue = -1;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() < 9) continue;
                String deptCode = line.substring(0, 3);
                int serialNo = Integer.parseInt(line.substring(6));

                switch (deptCode) {
                    case "011":
                        cseCount++;
                        break;
                    case "021":
                        eeeCount++;
                        break;
                    case "111":
                        if (serialNo > maxBBAValue) {
                            maxBBAValue = serialNo;
                            maxBBAId = line;
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }

        System.out.println("CSE Students count: " + cseCount);
        System.out.println("EEE Students count: " + eeeCount);
        System.out.println("BBA Student with max serial no: " + maxBBAId);
    }
}
