package unidade3.sisalucar;

public class Locacao {

	private int idLocacao;
	private int idCarro;
	private int idCliente;
	private double valorLocado;
	private String dataInicio;
	private String dataFim;
	
	public Locacao(int idLocacao, int idCarro, int idCliente,
			double valorLocado, String dataInicio, String dataFim) {
		super();
		this.idLocacao = idLocacao;
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.valorLocado = valorLocado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	Locacao(){}

	public int getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public double getValorLocado() {
		return valorLocado;
	}

	public void setValorLocado(double valorLocado) {
		this.valorLocado = valorLocado;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	
}
