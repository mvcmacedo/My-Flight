package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;
	private GerenciadorAeronaves gerenciador;
	
	public Aeronave(String codigo, String descricao, int capacidade, GerenciadorAeronaves gerenciador) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
		gerenciador.adicionar(this);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}


	public int getCapacidade() {
		return capacidade;
	}

	public GerenciadorAeronaves getGerenciador() {
		return gerenciador;
	}

	public String toString() {
		return "\nCódigo: " + this.getCodigo() + " Descricao: " + this.getDescricao() + " Capacidade: " + this.getCapacidade();
	}
}
