package unidade4.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {

	static Map<Cliente,List<Curso>> pagamentos = new HashMap<>();
	
	public static void main(String[] args) {
		//Criar os cursos disponíveis no site para venda
		Curso java8 = new Curso(1, "Java 8 para Web", 2000, Paths.get("/java8"));
		Curso oracle12c = new Curso(2, "Oracle 12C", 2500, Paths.get("/oracle12c"));
		Curso php7 = new Curso(3, "Php 7", 1500, Paths.get("/php7"));
				
		//Cadastrar o cliente
		Cliente antonio = new Cliente("123.456.789-00","Antonio Sampaio Jr", "assoftbel@gmail.com");
				
		//Criar a lista de cursos do cliente
		List<Curso> cursosAntonio = new LinkedList<>();
				
		//fazer um checkout dos cursos escolhidos
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		while(opcao!=4)
		{
			System.out.println("Qual curso deseja adquirir: [1-Java8],[2-Oracle12c],[3-Php7],[4-Finalizar Compra]");
			opcao = entrada.nextInt();
			if(opcao==1)
				cursosAntonio.add(java8);
			else if(opcao==2)
				cursosAntonio.add(oracle12c);
			else if (opcao==3)
				cursosAntonio.add(php7);
			else
				opcao=4;		
		}
		entrada.close();
		pagamentos.put(antonio, cursosAntonio);
		System.out.println(pagamentos);
	}	
}
