package unidade2;

public class VetorAB {

	public static void main(String[] args) {
		double A[] = {1,2,3,4,5}; //cria��o e inicializa��o
		double B[] = new double[5];
		
		for(int i =0; i<A.length;i++)
		{
			if (i%2==0) //� par?
				B[i] = A[i]*2;
			else //� �mpar
				B[i] = A[i]/2;						
		}		
				
		for(double x : B)
			System.out.println(x);
	}
}
