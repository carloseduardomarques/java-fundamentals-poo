package unidade2;

public class VetorAB {

	public static void main(String[] args) {
		double A[] = {1,2,3,4,5}; //criação e inicialização
		double B[] = new double[5];
		
		for(int i =0; i<A.length;i++)
		{
			if (i%2==0) //é par?
				B[i] = A[i]*2;
			else //é ímpar
				B[i] = A[i]/2;						
		}		
				
		for(double x : B)
			System.out.println(x);
	}
}
