package unidade4;

public class Conta {

	private int numero;
	protected double saldo;
	private double limite;
	private String nome;	
	
	static int numContas;
	final String nomeBanco = "BB";
	
	//construtor
	public Conta(int numero, double saldo, double limite, String nome) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.nome = nome;
	}
	
	Conta(){}
	
	protected void corrigirConta(float taxa)
	{
		//this.saldo = saldo*(1+taxa);		
	}	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getNumContas() {
		return numContas;
	}

	public static void setNumContas(int numContas) {
		Conta.numContas = numContas;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	boolean realizarSaque(double valor)
	{
		if (valor < (saldo+limite))
		{
			saldo = saldo - valor;
			return true;
		}
		else	
			return false;
	}	
	
	void realizarDeposito(double valor)
	{
		
	}	
	void realizarTransferencia(Conta conta, double valor)
	{
		conta.saldo = conta.saldo + valor;		
	}
	
	static void mensagem()
	{
		System.out.println("/*******************/");
		System.out.println("/*******************/");
		System.out.println("/*******************/");
	}
	
	public static void main(String[] args) 
	{
		mensagem();
		Conta conta1 = new Conta(123,1000,500,"antonio");
		//criação do 1 objeto
		//conta1.saldo = 1000;
		numContas++;
		Conta conta2 = new Conta(456,2000,1000,"pedro");
		//criação do 2 objeto
		numContas++;
		conta1.realizarTransferencia(conta2, 50);
		Conta conta3 = new Conta();
		numContas++;
		System.out.println(numContas);
		
		Conta conta;
		conta = new ContaCorrente();
		conta.corrigirConta(0.01f);
		
		if (conta instanceof ContaCorrente)
			System.out.println("OK!");
				
		conta = new ContaPoupanca();
		
		if (conta instanceof ContaPoupanca)
			System.out.println("OK!");
		
		conta.corrigirConta(0.02f);
	}
}
