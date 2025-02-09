package P;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicGui  implements ActionListener {


    private JFrame frame;
    private JPanel panel;
    private JButton addButton;
    private int buttonCount=0;


    public DynamicGui() {
        frame = new JFrame();
        panel = new JPanel();
        addButton = new JButton("Add");
        frame.setTitle("Dynamic GUI");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.add(addButton);
        frame.add(panel);

        addButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        buttonCount++;
        JButton button = new JButton("Ab" +buttonCount);
        panel.add(button);
        panel.revalidate();
    }
    public static void main(String[] args) {
        new DynamicGui();
    }
}
