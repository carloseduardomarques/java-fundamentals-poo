package unidade3.sisalucar;

public class SisalucarApp {

	public static void main(String[] args) {
		
		Cliente morany = new Cliente();
		//atributos
		morany.setIdCliente(1);
		morany.setCpf("123-90");
		morany.setNome("Morany");
		morany.setCnh("7z4ea");		
		
		Cliente lucas = new Cliente();
		
		Carro palio = new Carro();
		//atributos
		palio.setAno(2014);
		palio.setCor("preto");
		palio.setFabricante("fiat");
		palio.setIdCarro(1);
		palio.setModelo("palio");
		palio.setPlaca("jwe-1245");
		palio.setValorDiaria(100);
		
		Carro fusca = new Carro();

		//objeto sisalucar
		SisalucarApp app = new SisalucarApp();
		app.realizarLocacao(morany.getIdCliente(), palio.getIdCarro(),palio.getValorDiaria());
		
	}
	//método
	void realizarLocacao(int idCliente,int idCarro,double valorDiaria)
	{
		Locacao locacao = new Locacao();
		locacao.setIdCliente(idCliente);
		locacao.setIdCarro(idCarro);
		locacao.setValorLocado(valorDiaria);
	}
	
	void gerarRelatorioLocacao(Locacao locacao)
	{
		double totalFaturado = 0;
		totalFaturado = locacao.getValorLocado();
		System.out.println("Faturamento:"+totalFaturado);
	}
}
