package pucrs.myflight.modelo;

public class Aeroporto {
	private String codigo;
	private String nome;
	private double latitude;
	private double longitude;
	
	public Aeroporto(String codigo, String nome, Double latitude, Double longitude) {
		this.codigo = codigo;
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
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

	public String toString() {
		return "\nCódigo: " + this.getCodigo() + " Nome: " + this.getNome() + " Local: " + this.getLatitude() + ", " + this.getLongitude();
	}
}
