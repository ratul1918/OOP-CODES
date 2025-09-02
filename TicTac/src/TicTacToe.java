import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame("Tic Tac Toe"); 
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
 
    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(Color.CYAN);
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Ink Free", Font.BOLD, 70));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("TIC-TAC-TOE");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(Color.GRAY);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(Color.RED);
                        buttons[i].setText("X");
                        player1_turn = false;
                        textField.setText("O Turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("O");
                        player1_turn = true;
                        textField.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textField.setText("X Turn");
        } else {
            player1_turn = false;
            textField.setText("O Turn");
        }
    }

    public void check() {
        // X wins
        if (checkCombo(0, 1, 2, "X")) XWins(0, 1, 2);
        if (checkCombo(3, 4, 5, "X")) XWins(3, 4, 5);
        if (checkCombo(6, 7, 8, "X")) XWins(6, 7, 8);
        if (checkCombo(0, 3, 6, "X")) XWins(0, 3, 6);
        if (checkCombo(1, 4, 7, "X")) XWins(1, 4, 7);
        if (checkCombo(2, 5, 8, "X")) XWins(2, 5, 8);
        if (checkCombo(0, 4, 8, "X")) XWins(0, 4, 8);
        if (checkCombo(2, 4, 6, "X")) XWins(2, 4, 6);

        // O wins
        if (checkCombo(0, 1, 2, "O")) OWins(0, 1, 2);
        if (checkCombo(3, 4, 5, "O")) OWins(3, 4, 5);
        if (checkCombo(6, 7, 8, "O")) OWins(6, 7, 8);
        if (checkCombo(0, 3, 6, "O")) OWins(0, 3, 6);
        if (checkCombo(1, 4, 7, "O")) OWins(1, 4, 7);
        if (checkCombo(2, 5, 8, "O")) OWins(2, 5, 8);
        if (checkCombo(0, 4, 8, "O")) OWins(0, 4, 8);
        if (checkCombo(2, 4, 6, "O")) OWins(2, 4, 6);
    }

    private boolean checkCombo(int a, int b, int c, String symbol) {
        return buttons[a].getText().equals(symbol) &&
               buttons[b].getText().equals(symbol) &&
               buttons[c].getText().equals(symbol);
    }

    public void XWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("X Wins");
    }

    public void OWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("O Wins");
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
