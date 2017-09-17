package unidade4;

import unidade4.rh.Funcionario;
import unidade4.sisalucar.Carro;
import unidade4.sisalucar.Veiculo;

public class ExemploCasting {

	public static void main(String[] args) {
		
		int a = 5;
		byte b;
		b = (byte)a;
		byte c = 6;
		int d;
		d = c;
		
		Veiculo veiculo = new Carro();
		
		Carro carro = (Carro)veiculo;
		
		double e = 5.0;
	}
	
	
	
}
