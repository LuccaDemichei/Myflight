package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {
    private ArrayList<Rota> listaRotas;

    public GerenciadorRotas(){
        listaRotas = new ArrayList<>();
    }

    public void adicionar(Rota rota){
        listaRotas.add(rota);
    }

    public Rota listarTodas(){
        System.out.println("Lista de Rotas: ");
        System.out.println("---------------");
        for(Rota r : listaRotas){
            System.out.println(r);
        }
        return null;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
        System.out.println("Busca de Rota pela origem ");
        System.out.println("---------------------------------");
        for(Rota r: listaRotas){
            if(r.getOrigem() == orig){
                System.out.println("Saindo de " + r.getOrigem().getNome() + " para " + r.getDestino().getNome());
            }
        }
        return null;
    }

    public void ordenaRotaNomeCiaAerea(){
        Collections.sort(listaRotas);
        for(Rota r : listaRotas){
            System.out.println(r);
        }
    }

}
