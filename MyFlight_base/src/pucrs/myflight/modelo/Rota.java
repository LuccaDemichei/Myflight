package pucrs.myflight.modelo;

public class Rota implements Comparable<Rota>{
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}	
	
	public CiaAerea getCia() {
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

	public String toString(){
		return getCia().getNome() + " | De " + getOrigem().getNome() + " para " + getDestino().getNome() + " | " + getAeronave().getDescricao();
	}

	/*
	 * Metodo implementado da interface Comparable que ordena as rotas de acordo com o nome da Cia Aerea
	 * Implementado por Lucca Demichei - dia 09/05
	 */
	public int compareTo(Rota ciaRota){
		return cia.getNome().compareTo(ciaRota.cia.getNome());
	}
}
