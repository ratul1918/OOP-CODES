import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (
                Scanner sc = new Scanner(new File("f.txt"));  // src ফোল্ডারের input.txt ফাইল পড়বে
                PrintWriter pw = new PrintWriter(new File("g.txt"));  // ফলাফল output.txt-তে লিখবে
        ) {
            int mn = Integer.MAX_VALUE;  // সর্বনিম্ন সংখ্যা খুঁজতে সর্বোচ্চ মান দিয়ে শুরু
            boolean foundNumber = false;  // কোনো সংখ্যা পাওয়া গেছে কি না চেক করতে

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();  // প্রতিটি লাইন পড়ে স্পেস বাদ দিচ্ছি
                if (line.matches("^-?\\d+$")) {  // শুধুমাত্র পূর্ণসংখ্যা (positive/negative) হলে
                    mn = Math.min(mn, Integer.parseInt(line));  // সর্বনিম্ন সংখ্যা আপডেট করছি
                    foundNumber = true;
                }
            }

            // যদি কোনো সংখ্যা পাওয়া যায়, তাহলে সেটি লিখবে
            if (foundNumber) {
                pw.println(mn);
            } else {
                pw.println("No numbers found.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");  // ফাইল না থাকলে এরর মেসেজ দেখাবে
        } catch (Exception e) {
            e.printStackTrace();  // অন্য কোনো সমস্যা হলে এর বিস্তারিত দেখাবে
        }
    }
}
