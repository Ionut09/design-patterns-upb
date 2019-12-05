package ionut.training.oop.behavioral.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ionut.training.MyFrame;

import static javax.swing.JOptionPane.showMessageDialog;

public class ObserverWithGUI {

    public static void main(String... args) {
        MyFrame frame = new MyFrame();

        //    public void actionPerformed(ActionEvent e);
        ActionListener clicked_me = event -> showMessageDialog(null, "He clicked me");
        frame.button.addActionListener(clicked_me);


        frame.button.addActionListener(new MyActionListener());

    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("He clicked me in console");

    }
}
