import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
    MyFrame(){
        
        this.setTitle("CAFE SHOP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,500);
        this.setVisible(true);

        ImageIcon image =new ImageIcon("Logo.webp");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.WHITE);



    }
}
