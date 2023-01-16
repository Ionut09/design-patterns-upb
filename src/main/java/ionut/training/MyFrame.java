package ionut.training;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame {
    static {
        UIUtils.setUIFont(25);
    }

    public JButton button = new JButton("Click me");
    public JPanel panel = new JPanel(new GridLayout(1, 1));

    public MyFrame() {

        add(panel);

        panel.add(new JTextField(8));
        panel.add(new JTextField(8));
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        panel.add(button, constraints);

        setTitle(" Observer design pattern");
        pack();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }
}
