import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.CYAN);

        JButton button = new JButton("Click ME");
        button.setBounds(250, 250, 100, 50);
        frame.add(button);

        JLabel label = new JLabel("");
        label.setBounds(400, 440, 200, 50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(label);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("WOW you just clicked me");
            }
        };
        button.addActionListener(al);

        frame.setVisible(true);
    }
}
