package ionut.training.oop.behavioral.observer;

import ionut.training.MyFrame;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MyButonListeners {
	
	public static void main(String[] args) {
		MyFrame frame  = new MyFrame();
		
		frame.button.addActionListener(event1 -> JOptionPane.showMessageDialog(null, "He clicked me"));
		frame.button.addActionListener(event -> System.out.println("Ouch!!!"));
	}
}
