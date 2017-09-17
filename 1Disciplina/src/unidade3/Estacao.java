package unidade3;

public enum Estacao {

	INVERNO(1),VERAO(2),PRIMAVERA(3),OUTONO(4);
	int valor;
	
	Estacao(int valor){
	     this.valor = valor;
	}
	
	public int getValor(){
	     return this.valor;
	}
}
