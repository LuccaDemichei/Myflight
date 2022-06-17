package pucrs.myflight.modelo;

public class Aeroporto implements Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public String toString(){
		return getCodigo() + " | " + getNome() + " | " + "Latitude: " + loc.getLatitude() + " Longitude: " + loc.getLongitude();
	}

	/*
	 * Metodo implementado da interface Comparable para ordenar alfabeticamente os aeroportos pelo nome
	 * Implementado por Lucca Demichei - dia 09/05
	 */
	public int compareTo(Aeroporto aero){
		return nome.compareTo(aero.nome);
	}
}
