package unidade2;

import javax.swing.JOptionPane;

public class Faturamento {

	public static void main(String[] args) {
		float fatJan; //= 15000;
		float fatFev; //= 23000;
		float fatMar; //= 17000;
		
		String janeiro = JOptionPane.showInputDialog("Digite o faturamento de janeiro");
		fatJan = Float.parseFloat(janeiro);
		fatFev = Float.parseFloat(JOptionPane.showInputDialog("Digite o faturamento de fevereiro"));
		fatMar = Float.parseFloat(JOptionPane.showInputDialog("Digite o faturamento de marco"));
		float resultado = fatJan+fatFev+fatMar;
		System.out.println("O valor total e =>"+resultado);
		

	}

}
