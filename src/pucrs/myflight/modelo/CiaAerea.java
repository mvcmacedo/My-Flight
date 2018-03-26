package pucrs.myflight.modelo;

public class CiaAerea {
	private String codigo;
	private String nome;
	private GerenciadorCias gerenciador;
	
	public CiaAerea(String codigo, String nome, GerenciadorCias gerenciador) {
		this.codigo = codigo;
		this.nome = nome;
		gerenciador.adicionar(this);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public GerenciadorCias getGerenciador() {
		return gerenciador;
	}

	public String toString() {
		return "\nCódigo: " + this.getCodigo() + " Nome: " + this.getNome();
	}
}
