package ionut.training.oop.behavioral.observer;

import ionut.training.MyFrame;

import static javax.swing.JOptionPane.showMessageDialog;

public class ObserverWithGUI {

    public static void main(String... args) {
        MyFrame frame = new MyFrame();

        //    public void actionPerformed(ActionEvent e);
        frame.button.addActionListener(event ->
                showMessageDialog(null, "He clicked me"));
        frame.button.addActionListener(event ->
                System.out.println("He clicked me in console"));


    }
}
