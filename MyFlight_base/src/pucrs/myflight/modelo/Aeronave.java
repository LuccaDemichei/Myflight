package pucrs.myflight.modelo;

public class Aeronave implements Contavel{
	private String codigo;
	private String descricao;
	// Abaixo, atributo de classe para guardar o numero de objetos Aeronave
	private static int numeroAeronaves = 0;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		//Abaixo, cada aeronave criada, soma 1 ao contador
		numeroAeronaves++;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public String toString(){
		return getCodigo() + " | " + getDescricao();
	}

	/*
	 * Metodo implementado da interface Contavel, que retorna a quantidade de Aeronaves criadas
	 */
	public int qntdObjetos(){
		return numeroAeronaves;
	}
}
