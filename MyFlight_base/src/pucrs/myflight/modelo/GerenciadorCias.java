/*alterado por Gabriela Sussuarana, na data 07/05/2022
No código abaixo foi criado os métodos para adicionar as companhias aereas, listar todas as companhias, buscar o código e o nome
*/
package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia){
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas(){
		System.out.println(empresas.toString());
		return empresas;
	}

	public CiaAerea buscarCodigo(String cod){	
		
		if(empresas.isEmpty()) {
			System.out.println("Não existem companhias cadastradas!");
			return null;
		} else {
			System.out.print("Cia aerea '"+ cod + "' encontrada: ");
			for(CiaAerea ca : empresas){
				if (ca.getCodigo() == cod){
					System.out.println(ca.getNome());
				}
			}
		}
		return null;
	}

	public CiaAerea buscarNome(String cod){
		if(empresas.isEmpty())
		{
			System.out.println("Não existem companhias cadastradas!");
			return null;
		} else {
			System.out.print("Cia aerea '"+ cod + "' encontrada: ");
			for(CiaAerea ca : empresas){
				if (ca.getNome() == cod){
					System.out.println(ca.getCodigo());
				}
			}
		}
		return null;
}
}