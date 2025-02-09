import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    JFrame frame;
    JTextField username;
    JPasswordField password;
    JButton login;

    void frame() {
        frame = new JFrame("Login");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        username = new JTextField();
        username.setBounds(50, 50, 300, 30);
        frame.add(username);

        password = new JPasswordField();
        password.setBounds(50, 100, 300, 30);
        frame.add(password);

        login = new JButton("Login");
        login.setBounds(50, 150, 300, 30);
        frame.add(login);

        username.addActionListener(this);
        password.addActionListener(this);
        login.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String user = username.getText();
            String pass = new String(password.getPassword());

            JOptionPane.showMessageDialog(frame, "Username: " + user + "\nPassword: " + pass);
        }
    }

    public static void main(String[] args) {
        new Login().frame();
    }
}
