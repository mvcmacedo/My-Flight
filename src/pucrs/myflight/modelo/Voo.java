package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	private GerenciadorVoos gerenciador;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao, GerenciadorVoos gerenciador) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
		gerenciador.adicionar(this);

	}
	
	public Rota getRota()
	{
		return rota;
	}
	
	public LocalDateTime getDatahora() {

		return datahora;
	}
	
	public Duration getDuracao() {

		return duracao;
	}
	
	public Status getStatus() {

		return status;
	}

	public GerenciadorVoos getGerenciador() {
		return gerenciador;
	}

	public void setStatus(Status novo) {

		this.status = novo;
	}

	public String toString() {
		return "\nRota: " + this.getRota() + "\nData: " + this.getDatahora() + "\nDuração: " + this.getDuracao() + "\nStatus: " + this.getStatus() + "\n";
	}
}
