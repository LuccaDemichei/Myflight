package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	/*
	* Segundo construtor da classe voo, utilizando o conceito de sobrecarga
	*/
	public Voo(Rota rota, Duration duracao){
		this.rota = rota;
		this.datahora = LocalDateTime.of(2016, 8, 12, 12, 00);
		this.duracao = duracao;
	}
	
	public Rota getRota() {
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
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public String toString(){
		return getDatahora().getDayOfMonth() + "/" + getDatahora().getMonth() + "/" + getDatahora().getYear()
				+ " | " + getDatahora().getHour() + "h" + " | " + "Duracao: " + getDuracao() + " | " + getRota() + " | " + getStatus();
	}

}
