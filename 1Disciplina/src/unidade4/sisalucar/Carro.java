package unidade4.sisalucar;

public class Carro extends Veiculo {

	public void acelera(){
		System.out.println("Subclasse Carro");		
	} //anulação
	
	public void freia(){
		System.out.println("Subclasse Carro");
	} //anulação
	
	public void acelera(int limiteVelocidade){
		System.out.println("Subclasse Carro");		
	} //sobrecarga
	
	public void freia(int distanciaMaxima){
		System.out.println("Subclasse Carro");
	} //sobrecarga

	public void abastecer(){}
	//extensão
	public void fecharPorta(){}
	//extensão
	public void abrirPorta(){}
	//extensão
	
	public static void main(String[] args) {
		Carro carroSampaio = new Carro();
	}
}
