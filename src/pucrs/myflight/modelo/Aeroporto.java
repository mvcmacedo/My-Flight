package pucrs.myflight.modelo;

public class Aeroporto {
	private String codigo;
	private String nome;
	private double latitude;
	private double longitude;
	private GerenciadorAeroportos gerenciador;
	
	public Aeroporto(String codigo, String nome, Double latitude, Double longitude, GerenciadorAeroportos gerenciador) {
		this.codigo = codigo;
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		gerenciador.adicionar(this);
	}
	
	public String getCodigo() {

		return codigo;
	}
	
	public String getNome() {

		return nome;
	}

	public double getLatitude(){
		return latitude;
	}

	public double getLongitude(){
		return longitude;
	}

	public GerenciadorAeroportos getGerenciador() {
		return gerenciador;
	}

	public String toString() {
		return "\nCódigo: " + this.getCodigo() + " Nome: " + this.getNome() + " Local: " + this.getLatitude() + ", " + this.getLongitude();
	}
}
