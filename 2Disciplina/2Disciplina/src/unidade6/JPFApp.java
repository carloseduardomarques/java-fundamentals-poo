package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPFApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplica��o");
		frame.setSize(350, 250);
		Container cont = frame.getContentPane();
		JPasswordField tf = new JPasswordField("Digite Aqui");
		cont.add(tf,BorderLayout.NORTH);
		frame.setVisible(true);

	}

}
