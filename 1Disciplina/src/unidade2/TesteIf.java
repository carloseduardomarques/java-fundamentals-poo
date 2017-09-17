package unidade2;

public class TesteIf {

	public static void main(String[] args) {
		int cont = 0;
		
		if (cont == 0)
		{
			System.out.println("OK");
			System.out.println();
		}
		else if (cont ==1)
			System.out.println("NOK");
		else if (cont ==2)
			System.out.println("NOK");
		
		String bairro = "Nazare";
		
		switch(bairro)
		{
			case "Nazare":
				System.out.println("Bairro Nazare");
				break;
			case "Umarizal":
				System.out.println("Bairro Umarizal");
				break;
			default:
				System.out.println("Bairro Nao Listado");
		}
		
	}

}
