package unidade2;

public class MatrizIdentidade {

	public static void main(String[] args) {
		//definição da matriz
		int matriz[][] = new int[3][3];
		
		for(int i =0; i<3;i++)
			for(int j=0;j<3;j++)
			{
				if(i==j)
					matriz[i][j] = 1;
				else
					matriz[i][j] = 0;
			}
		//impressão da matriz
		for(int i =0; i<3;i++)
		{	
			System.out.println();
			for(int j=0;j<3;j++)
				System.out.print(matriz[i][j]);
	
		}
	}
}
