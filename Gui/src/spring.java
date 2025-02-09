public class spring {
    public void actionPerformed(ActionEvent e) {
        // Get the current output value
        int outputValue = Integer.parseInt(Output.getText());

        // Get the input text and split it into operator and number
        String inputText = Input.getText();
        String[] parts = inputText.split(" ");

        if (parts.length == 2) {
            String operator = parts[0];
            int inputValue = Integer.parseInt(parts[1]);

            // Perform the operation based on the operator
            int result = outputValue;  // Default to current output value
            switch (operator) {
                case "+":
                    result += inputValue;
                    break;
                case "-":
                    result -= inputValue;
                    break;
                case "*":
                    result *= inputValue;
                    break;
                case "/":
                    if (inputValue != 0) {
                        result /= inputValue;
                    } else {
                        Output.setText("Error"); // Handle division by zero
                        return;
                    }
                    break;
                default:
                    Output.setText("Invalid"); // Handle invalid operator
                    return;
            }

            // Update the output label with the new result
            Output.setText(String.valueOf(result));
        } else {
            Output.setText("Invalid Input"); // Handle incorrect input format
        }
    }

}
