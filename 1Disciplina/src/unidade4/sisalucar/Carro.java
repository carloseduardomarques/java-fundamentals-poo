package unidade4.sisalucar;

public class Carro extends Veiculo {

	public void acelera(){
		System.out.println("Subclasse Carro");		
	} //anula��o
	
	public void freia(){
		System.out.println("Subclasse Carro");
	} //anula��o
	
	public void acelera(int limiteVelocidade){
		System.out.println("Subclasse Carro");		
	} //sobrecarga
	
	public void freia(int distanciaMaxima){
		System.out.println("Subclasse Carro");
	} //sobrecarga

	public void abastecer(){}
	//extens�o
	public void fecharPorta(){}
	//extens�o
	public void abrirPorta(){}
	//extens�o
	
	public static void main(String[] args) {
		Carro carroSampaio = new Carro();
	}
}
