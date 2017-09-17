package unidade3;

public class ExemploString {

	public static void main(String[] args) {
		
		String nome = "Antonio ";		
		nome = nome  + "Benedito";		
		System.out.println(nome.length());
		System.out.println(nome.substring(0,7));
		System.out.println(nome.charAt(5)); 
		System.out.println(nome.toUpperCase()); 
		System.out.printf("%.2f", 1.234);
	}
}
