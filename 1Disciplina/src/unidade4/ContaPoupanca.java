package unidade4;

public class ContaPoupanca extends Conta {

	protected void corrigirConta(float taxa)
	{
		this.saldo = saldo*(1+(3*taxa));		
	}
}
