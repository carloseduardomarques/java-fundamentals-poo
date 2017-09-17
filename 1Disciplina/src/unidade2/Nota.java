package unidade2;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua nota");
		float nota = entrada.nextFloat();
		
		float soma = 0;
		float media = 0;
		float maior = nota,menor = nota;
		int numNotas = 0;
		
		while(nota != -1)
		{
			numNotas++;
			//selecionar o maior
			if (nota>maior)
				maior = nota;
			//selecionar o menor
			if (nota<menor)
				menor = nota;		
			//calcular a média
			soma = soma + nota;
			System.out.println("Digite a sua nota");
			nota = entrada.nextFloat();
				
		}
		System.out.println("A media = "+(soma/numNotas));
		System.out.println("A maior = "+maior);
		System.out.println("A menor = "+menor);

	}

}
