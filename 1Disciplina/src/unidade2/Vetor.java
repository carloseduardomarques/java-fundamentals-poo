package unidade2;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		//criação de um vetor de 04 posições
		double nota[] = new double[4];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua nota");
		
		/*nota[0] = entrada.nextDouble();
		nota[1] = entrada.nextDouble();
		nota[2] = entrada.nextDouble();
		nota[3] = entrada.nextDouble();*/
		int i;
		for(i =0; i<nota.length;i++)
			nota[i] = entrada.nextDouble();
		
		for(double x : nota)
			System.out.println(x);
		
		//criação de uma matriz 4x4
		int matriz[][] = new int[4][4];
		
		for(i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz.length;j++)
			{
				matriz[i][j]=0;
				System.out.println("["+i+"]["+j+"]"+matriz[i][j]);
			}			
		}
	}
}
