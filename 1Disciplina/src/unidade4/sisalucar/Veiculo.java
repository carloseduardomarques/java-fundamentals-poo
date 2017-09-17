package unidade4.sisalucar;

public class Veiculo {

	protected int passageiros;
	protected float velocidade;
	
	public Veiculo(int passageiros, float velocidade) {
		super();
		this.passageiros = passageiros;
		this.velocidade = velocidade;
	}
	
	public Veiculo(){}
	
	public void acelera(){}
	
	public void freia(){}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	
	
	
}
