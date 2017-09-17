package unidade3;

public class Aluno {
	//atributos
	String cpf;
	String nome;
	String email;
	boolean pagamento;
	
	double calcularMedia(float...notas)
	{
		float soma = 0;
		
		for(float nota: notas)
			soma = soma + nota;
		float media = soma/notas.length;
		return (media);
	}
	
	boolean realizarPagamento()
	{
		return false;
	}
	public static void main(String[] args) {
		Conta.mensagem();
		System.out.println(Conta.numContas);
	}
	
}
