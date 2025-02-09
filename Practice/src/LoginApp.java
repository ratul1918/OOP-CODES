
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class LoginApp {
    private static final String FILE_NAME = "users.txt";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton registerButton = new JButton("Register");
        JButton loginButton = new JButton("Login");
        JButton viewButton = new JButton("View All");

        JTextArea displayArea = new JTextArea(5, 20);
        displayArea.setEditable(false);

        registerButton.addActionListener(e -> registerUser(emailField.getText(), new String(passwordField.getPassword())));
        loginButton.addActionListener(e -> loginUser(emailField.getText(), new String(passwordField.getPassword())));
        viewButton.addActionListener(e -> viewUsers(displayArea));

        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(registerButton);
        frame.add(loginButton);
        frame.add(viewButton);
        frame.add(new JScrollPane(displayArea));

        frame.setVisible(true);
    }

    private static void registerUser(String email, String password) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(email + "," + password + "\n");
            JOptionPane.showMessageDialog(null, "Registration successful!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving data!");
        }
    }

    private static void loginUser(String email, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials[0].equals(email) && credentials[1].equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Login unsuccessful!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading data!");
        }
    }

    private static void viewUsers(JTextArea displayArea) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            StringBuilder users = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                users.append(line).append("\n");
            }
            displayArea.setText(users.toString());
        } catch (IOException e) {
            displayArea.setText("Error loading users!");
        }
    }
}

class StudentIDProcessor {
    public static void main(String[] args) {
        String filename = "id.txt";
        int cseCount = 0, eeeCount = 0;
        String maxBBAId = "";
        int maxBBAValue = -1;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String deptCode = line.substring(0, 3);
                int serialNo = Integer.parseInt(line.substring(6));

                if (deptCode.equals("011")) cseCount++;
                if (deptCode.equals("021")) eeeCount++;
                if (deptCode.equals("111") && serialNo > maxBBAValue) {
                    maxBBAValue = serialNo;
                    maxBBAId = line;
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
