import javax.swing.*; // Swing components
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The class implements ActionListener to handle button and text field actions
public class Login implements ActionListener {

    JFrame frame;              // Main window
    JTextField username;       // Text field for username
    JPasswordField password;   // Password field
    JButton login;             // Login button

    // Method to create the GUI
    void frame() {
        frame = new JFrame("Login"); // Create frame with title "Login"
        frame.setSize(500, 500); // Set size of the frame
        frame.setLocationRelativeTo(null); // Center the frame on screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on exit
        frame.setLayout(null); // No layout manager (manual positioning)

        // Username text field
        username = new JTextField();
        username.setBounds(50, 50, 300, 30); // x, y, width, height
        frame.add(username); // Add to frame

        // Password field
        password = new JPasswordField();
        password.setBounds(50, 100, 300, 30);
        frame.add(password);

        // Login button
        login = new JButton("Login");
        login.setBounds(50, 150, 300, 30);
        frame.add(login);

        // Register action listeners
        username.addActionListener(this);
        password.addActionListener(this);
        login.addActionListener(this);

        frame.setVisible(true); // Make the GUI visible
    }

    // Handle button and field actions
    @Override
    public void actionPerformed(ActionEvent e) {
        // If the Login button is clicked or Enter is pressed in a field
        if (e.getSource() == login) {
            String user = username.getText();              // Get username
            String pass = new String(password.getPassword()); // Get password securely

            // Show user input in a dialog box
            JOptionPane.showMessageDialog(frame, "Username: " + user + "\nPassword: " + pass);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new Login().frame(); // Create and show the frame
    }
}
