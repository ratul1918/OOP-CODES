import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {

        JLabel label=new JLabel();
        label.setText("Hey");

        JPanel panel =new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(0,0,250,250);

        JPanel Bluepanel =new JPanel();
        Bluepanel.setBackground(Color.BLUE);
        Bluepanel.setBounds(250,0,250,250);

        JFrame frame = new JFrame();
        frame.setTitle("CAFE SHOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        panel.add(label);
        Bluepanel.add(label);
        frame.add(panel);
        frame.add(Bluepanel);

    }
}