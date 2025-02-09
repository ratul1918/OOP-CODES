import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kaj implements ActionListener {
    JFrame frame;
    JButton button;
    JTextField textField;
    JLabel label;
    JCheckBox checkBox;

    Kaj() {
        frame = new JFrame("Kaj");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        textField = new JTextField(10);
        frame.add(textField);

        button = new JButton("Show Text");
        frame.add(button);
        button.addActionListener(this);

        label = new JLabel("");
        frame.add(label);

        checkBox = new JCheckBox();
        checkBox.setText("Text box");
        checkBox.setFocusable(false);
        checkBox.addActionListener(this);

        frame.add(checkBox);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(textField.getText());
        if(e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }

    public static void main(String[] args) {
        new Kaj();
    }
}
