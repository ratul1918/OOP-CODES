import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField firstNumberField, secondNumberField;
    private JTextArea resultArea;
    private JButton addButton, subButton, mulButton, divButton;

    Calculator() {
        setTitle("Khalid's Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        firstNumberField = new JTextField();
        secondNumberField = new JTextField();

        inputPanel.add(new JLabel("Khalid, enter the 1st number:"));
        inputPanel.add(firstNumberField);
        inputPanel.add(new JLabel("Khalid, enter the 2nd number:"));
        inputPanel.add(secondNumberField);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        addButton = new JButton("+ Khalid");
        subButton = new JButton("- Khalid");
        mulButton = new JButton("* Khalid");
        divButton = new JButton("/ Khalid");

        addButton.addActionListener(new OperationAction("+"));
        subButton.addActionListener(new OperationAction("-"));
        mulButton.addActionListener(new OperationAction("*"));
        divButton.addActionListener(new OperationAction("/"));

        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);

        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(resultArea), BorderLayout.SOUTH);

        setVisible(true);
    }

    class OperationAction implements ActionListener {
        private String operator;

        OperationAction(String operator) {
            this.operator = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(firstNumberField.getText());
                double num2 = Double.parseDouble(secondNumberField.getText());
                double result = 0.0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        resultArea.setText("Khalid, the addition result is: " + result);
                        break;
                    case "-":
                        result = num1 - num2;
                        resultArea.setText("Khalid, the subtraction result is: " + result);
                        break;
                    case "*":
                        result = num1 * num2;
                        resultArea.setText("Khalid, the multiply result is: " + result);
                        break;
                    case "/":
                        if (num2 == 0) {
                            resultArea.setText("Khalid, the division can't be determined due to an error!");
                        } else {
                            result = num1 / num2;
                            resultArea.setText("Khalid, the division result is: " + result);
                        }
                        break;
                }
            } catch (NumberFormatException ex) {
                resultArea.setText("Khalid, please enter valid numbers!");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
