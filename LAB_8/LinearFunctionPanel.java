package LAB_8;

import javax.swing.*;
import java.awt.*;

public class LinearFunctionPanel extends JPanel {

    private int func = 0;
    private double k = 0.5;

    public void setFunc(int func) {
        this.func = func;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        // фон
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, w, h);

        // оси
        g.setColor(Color.BLACK);
        g.drawLine(0, h / 2, w, h / 2); // X
        g.drawLine(w / 2, 0, w / 2, h); // Y

        g.setColor(Color.RED);

        switch (func) {
            case 1:
                for (int x = -w / 2; x < w / 2; x++) {
                    int y1 = (int) (-k * x + h / 2);
                    int y2 = (int) (-k * (x + 1) + h / 2);
                    g.drawLine(x + w / 2, y1, x + 1 + w / 2, y2);
                }
                break;
            case 2:
                for (int x = -w / 2; x < w / 2; x++) {
                    int y1 = (int) (-3 * Math.pow(x / 50.0, 2) * 50 + h / 2);
                    int y2 = (int) (-3 * Math.pow((x + 1) / 50.0, 2) * 50 + h / 2);
                    g.drawLine(x + w / 2, y1, x + 1 + w / 2, y2);
                }
                break;
            case 3:
                for (int x = -w / 2; x < w / 2; x++) {
                    int y1 = (int) ((-Math.pow(x / 50.0, 2) + Math.pow(x / 50.0, 3)) * 50 + h / 2);
                    int y2 = (int) ((-Math.pow((x + 1) / 50.0, 2) + Math.pow((x + 1) / 50.0, 3)) * 50 + h / 2);
                    g.drawLine(x + w / 2, y1, x + 1 + w / 2, y2);
                }
                break;
            case 4:
                for (int x = -w / 2; x < w / 2; x++) {
                    int y1 = (int) ((Math.pow(x / 50.0, 3) + Math.pow(x / 50.0, 2) + x / 50.0) * 50 + h / 2);
                    int y2 = (int) ((Math.pow((x + 1) / 50.0, 3) + Math.pow((x + 1) / 50.0, 2) + (x + 1) / 50.0) * 50
                            + h / 2);
                    g.drawLine(x + w / 2, y1, x + 1 + w / 2, y2);
                }
                break;
            case 5:
                for (int x = -w / 2; x < w / 2; x++) {
                    int y1 = (int) (Math.pow(x / 50.0, 5) * 50 + h / 2);
                    int y2 = (int) (Math.pow((x + 1) / 50.0, 5) * 50 + h / 2);
                    g.drawLine(x + w / 2, y1, x + 1 + w / 2, y2);
                }
                break;
            case 6:
                for (int x = -w / 2; x < w / 2; x++) {
                    int y1 = (int) (-Math.sin(x / 50.0) * 50 + h / 2);
                    int y2 = (int) (-Math.sin((x + 1) / 50.0) * 50 + h / 2);
                    g.drawLine(x + w / 2, y1, x + 1 + w / 2, y2);
                }
                break;
            case 7:
                for (int x = -w / 2; x < w / 2; x++) {
                    int y1 = (int) ((Math.cos(x / 50.0 - 1) + x / 50.0) * 50 + h / 2);
                    int y2 = (int) ((Math.cos((x + 1) / 50.0 - 1) + (x + 1) / 50.0) * 50 + h / 2);
                    g.drawLine(x + w / 2, y1, x + 1 + w / 2, y2);
                }
                break;
        }
    }
}