package unidade4.sisalucar;

public class Moto extends Veiculo {

	public void acelera(){
		System.out.println("Subclasse Moto");		
	} //anula��o
	
	public void freia(){
		System.out.println("Subclasse Moto");
	} //anula��o
	
	public void acelera(int limiteVelocidade){
		System.out.println("Subclasse Moto");		
	} //sobrecarga
	
	public void freia(int distanciaMaxima){
		System.out.println("Subclasse Moto");
	} //sobrecarga
}
