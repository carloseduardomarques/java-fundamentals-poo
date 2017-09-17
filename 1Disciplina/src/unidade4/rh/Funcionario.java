package unidade4.rh;

public abstract class Funcionario {

	public abstract double getBonificacao();
	
	void verificarTipoFuncionario(Funcionario objeto)
	{
	   if (objeto instanceof Diretor)
	     System.out.println("Objeto Diretor");
	   else if (objeto instanceof Professor)
	     System.out.println("Objeto Professor");
	   else
	     System.out.println("Objeto Administrador");
	}	
}
