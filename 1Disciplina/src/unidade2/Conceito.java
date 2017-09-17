package unidade2;

import java.util.Scanner;

public class Conceito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua nota");
		int nota = entrada.nextInt();
	
		if ((nota>100)||(nota<0))
		{
			System.out.println("Nota Inválida");
			main(null);
		}
		else
		{
			//a nota está no intervalo de 0 a 100
			if (nota < 50)
				System.out.println("Conceito: Insuficiente");
			else if (nota < 70)
				System.out.println("Conceito: Regular");
			else if (nota < 90)
				System.out.println("Conceito: Bom");
			else
				System.out.println("Conceito: Excelente");
		}
	}

}
