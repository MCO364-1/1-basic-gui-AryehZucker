import java.awt.GridLayout;

import javax.swing.*;

public class Main {
    private static JFrame window;

    public static void main(String[] args) {
        window = new JFrame();
        configureWindow();
        constructUI();
        window.setVisible(true);
    }

    private static void configureWindow() {
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void constructUI() {
        window.setLayout(new GridLayout(2, 2));

        JTextField numInput1 = new JTextField();
        JTextField numInput2 = new JTextField();
        JLabel label = new JLabel("     ");
        JButton button = new JButton("Add");

        button.addActionListener((event) -> {
            Double num1 = Double.parseDouble(numInput1.getText());
            Double num2 = Double.parseDouble(numInput2.getText());
            label.setText(Double.toString(num1 + num2));
        });
        
        window.add(numInput1);
        window.add(numInput2);
        window.add(button);
        window.add(label);
    }
}
