public class nmbr4 {
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(output.getText());
        String[] ar = input.getText().trim().split(" +");
        double b = Double.parseDouble(ar[1]);
        double result = 0;
        if (ar[0].equals("+")) {
            result = a + b;
        } else if (ar[0].equals("-")) {
            result = a - b;
        } else if (ar[0].equals("*")) {
            result = a * b;
        } else if (ar[0].equals("/")) {
            result = a / b;
        }
        output.setText(String.valueOf(result));
    }
}

