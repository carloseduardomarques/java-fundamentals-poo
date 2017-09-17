package unidade4.rh;

public class Professor extends Funcionario implements Autenticavel,Contribuinte,Cidadao{

	public static void main(String[] args) {
		Funcionario diretor = new Diretor();
		diretor.verificarTipoFuncionario(diretor);
		
		diretor = new Professor();
		diretor.verificarTipoFuncionario(diretor);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void vota() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pagaIR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCPF() {
		// TODO Auto-generated method stub
		return null;
	}
}
