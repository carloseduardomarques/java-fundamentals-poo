package unidade4.sisalucar;

public class Onibus extends Veiculo {

	public void acelera(){
		System.out.println("Subclasse Onibus");		
	} //anula��o
	
	public void freia(){
		System.out.println("Subclasse Onibus");
	} //anula��o
	
	public void acelera(int limiteVelocidade){
		System.out.println("Subclasse Onibus");		
	} //sobrecarga
	
	public void freia(int distanciaMaxima){
		System.out.println("Subclasse Onibus");
	} //sobrecarga
}
