import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyColors implements ActionListener {
    private JFrame f;
    private JButton b;
    private Color[] colors = {Color.green, Color.red, Color.yellow};
    private Random random = new Random();

    public MyColors() {
        f = new JFrame("My Color");
        b = new JButton("Change Color");
    }

    public void display() {
        b.addActionListener(this);
        b.setForeground(Color.red);
        b.setBackground(Color.yellow);

        f.add(b);
        f.setSize(400, 400);
        f.getContentPane().setBackground(Color.green);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = random.nextInt(colors.length);
        f.getContentPane().setBackground(colors[index]);
    }

    public static void main(String[] args) {
        MyColors myColors = new MyColors();
        myColors.display();
    }
}
//Final spring 24