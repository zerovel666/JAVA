package LAB_11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUICalc {
    public void calculatorGUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        final double[] num1 = { 0 };
        final String[] operator = { "" };

        ActionListener action = e -> {
            String cmd = e.getActionCommand();

            if (cmd.matches("[0-9]")) {
                display.setText(display.getText() + cmd);
            } else if (cmd.matches("[+\\-*/]")) {
                num1[0] = Double.parseDouble(display.getText());
                operator[0] = cmd;
                display.setText("");
            } else if (cmd.equals("=")) {
                double num2 = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator[0]) {
                    case "+":
                        result = num1[0] + num2;
                        break;
                    case "-":
                        result = num1[0] - num2;
                        break;
                    case "*":
                        result = num1[0] * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            display.setText("Error");
                            return;
                        }
                        result = num1[0] / num2;
                        break;
                }

                display.setText(String.valueOf(result));
            } else if (cmd.equals("C")) {
                display.setText("");
            }
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(action);
            panel.add(btn);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
