package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTAApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplica��o");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JTextArea ta = new JTextArea("Digite Aqui");
		cont.add(ta,BorderLayout.NORTH);
		frame.setVisible(true);

	}

}
