package pucrs.myflight.modelo;

public class Rota {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	private GerenciadorRotas gerenciador;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave, GerenciadorRotas gerenciador) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;
		gerenciador.adicionar(this);
	}	
	
	public CiaAerea getCia()
	{
		return cia;
	}
	
	public Aeroporto getDestino() {

		return destino;
	}
	
	public Aeroporto getOrigem() {

		return origem;
	}
	
	public Aeronave getAeronave() {

		return aeronave;
	}

	public GerenciadorRotas getGerenciador() {
		return gerenciador;
	}

	public String toString() {
		return "\nCia Aérea: " + this.getCia() + "\nDestino: " + this.getDestino() + "\nOrigem: " + this.getOrigem() + "\nAeronave: " + this.getAeronave() + "\n";
	}
}
