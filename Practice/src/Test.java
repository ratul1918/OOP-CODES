import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    JFrame frame;
    JTextField textField;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    JButton addButton, subButton, mulButton, divButton, eqlButton;
    JButton DeleteButton, ClearButton, ResultButton;
    JPanel panel, panel1, panel2;
    String operator = "";
    Double num1 = 0.0, num2 = 0.0;
    Double result=0.0;

    Test() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(20, 20, 400, 50);
        frame.add(textField);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(20, 100, 300, 300);

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        button1.addActionListener(new NumberAction());
        button2.addActionListener(new NumberAction());
        button3.addActionListener(new NumberAction());
        button4.addActionListener(new NumberAction());
        button5.addActionListener(new NumberAction());
        button6.addActionListener(new NumberAction());
        button7.addActionListener(new NumberAction());
        button8.addActionListener(new NumberAction());
        button9.addActionListener(new NumberAction());

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 1, 5, 5));
        panel1.setBounds(330, 100, 80, 300);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqlButton = new JButton("=");

        addButton.addActionListener(new OpratorAction());
        subButton.addActionListener(new OpratorAction());
        mulButton.addActionListener(new OpratorAction());
        divButton.addActionListener(new OpratorAction());
        eqlButton.addActionListener(new OpratorAction());

        panel1.add(addButton);
        panel1.add(subButton);
        panel1.add(mulButton);
        panel1.add(divButton);
        panel1.add(eqlButton);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 3, 5, 5));
        panel2.setBounds(25, 400, 300, 40);

        DeleteButton = new JButton("Delete");
        ClearButton = new JButton("Clear");
        ResultButton = new JButton("Result");

        DeleteButton.addActionListener(new DirectionAction());
        ClearButton.addActionListener(new DirectionAction());
        ResultButton.addActionListener(new DirectionAction());

        panel2.add(DeleteButton);
        panel2.add(ClearButton);
        panel2.add(ResultButton);

        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);

        frame.setVisible(true);
    }

    class NumberAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String number = e.getActionCommand();
            textField.setText(textField.getText() + number);
        }
    }

    class OpratorAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("=")) {
                num2 = Double.parseDouble(textField.getText());
                Double result = 0.0;
                if (operator.equals("+")) {
                    result = num1 + num2;
                } else if (operator.equals("-")) {
                    result = num1 - num2;
                } else if (operator.equals("*")) {
                    result = num1 * num2;
                } else if (operator.equals("/")) {
                    result = num1 / num2;
                }
                textField.setText(String.valueOf(result));
                num1 = result;
                operator = "";
            } else {
                operator = command;
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
            }
        }
    }
    class DirectionAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Delete")) {
                String currentText = textField.getText();
                if (currentText.length() > 0) {
                    textField.setText(currentText.substring(0, currentText.length() - 1));
                }
            } else if (command.equals("Clear")) {
                textField.setText("");
                num1 = 0.0;
                num2 = 0.0;
                operator = "";
                result = 0.0;
            } else if (command.equals("Result")) {
                textField.setText(String.valueOf(result));
            }

        }
    }

    public static void main(String[] args) {
        new Test();
    }
}
