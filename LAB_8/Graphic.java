package LAB_8;

import java.awt.*;
import javax.swing.*;

public class Graphic extends JFrame {

    private LinearFunctionPanel panel;

    public Graphic() {
        super("Построитель графиков");
        setLayout(null);
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        panel = new LinearFunctionPanel();
        panel.setBounds(200, 20, 480, 320);
        add(panel);

        String[] names = {
                "y = kx", "y = 3x^2", "y = −x^2 + x^3",
                "y = x^3 + x^2 + x", "y = x^5", "y = sin x",
                "y = cos(x − 1) + x"
        };

        for (int i = 0; i < names.length; i++) {
            Button b = new Button(names[i]);
            b.setBounds(30, 20 + i * 40, 150, 25);
            int funcNum = i + 1;
            b.addActionListener(e -> panel.setFunc(funcNum));
            add(b);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Graphic();
    }
}