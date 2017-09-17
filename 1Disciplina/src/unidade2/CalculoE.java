package unidade2;

import java.util.Scanner;

public class CalculoE {

	public static void main(String[] args) {
		//declaração das variáveis
		double e = 0;
		int i, x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de X");
		x = entrada.nextInt();
				
		for(i=1;i<=50;i++)
		{
			e = e + (Math.pow(x, i)/i);
		}		
		System.out.println("O valor de e="+e);
	}

}
