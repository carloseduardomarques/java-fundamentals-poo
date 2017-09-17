package unidade4;

public class ContaCorrente extends Conta {

	protected void corrigirConta(float taxa)
	{
		this.saldo = saldo*(1+(2*taxa));		
	}
	
}
