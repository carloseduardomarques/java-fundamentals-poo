package unidade2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero 1");
		float numero1 = entrada.nextFloat();
		System.out.println("Digite o numero 2");
		float numero2 = entrada.nextFloat();
		
		System.out.println("Soma="+(numero1+numero2));
		System.out.println("Subtracao="+(numero1-numero2));
		System.out.println("Multiplicacao="+(numero1*numero2));
		if (numero2 == 0)
		{
			System.out.println("Numero 2 deve ser maior do que 0!!!");
			main(null);
		}
		System.out.println("Divisao="+(numero1/numero2));
		
		System.out.println("Numero1 e maior que o Numero2?"+(numero1>numero2));
		System.out.println("Numero1 e igual que o Numero2?"+(numero1==numero2));
		System.out.println("Numero1 e menor que o Numero2?"+(numero1<numero2));
		

	}

}
