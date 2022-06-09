package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> listaAeronaves;

    public GerenciadorAeronaves(){
        listaAeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao){
        listaAeronaves.add(aviao);
    }

    public Aeronave listarTodas(){
        System.out.println("Lista de Aeronaves");
        System.out.println("------------------");
        for(Aeronave aero: listaAeronaves){
            System.out.println(aero.toString());
        }
        return null;
    }

    public Aeronave buscarPorCodigo(String cod){
        System.out.println("Busca pelo código " + cod);
        System.out.println("--------------------");
        for(Aeronave aero: listaAeronaves){
            if (aero.getCodigo() == cod){
                System.out.println(aero.getDescricao());
            }
        }
        return null;
    }

}
