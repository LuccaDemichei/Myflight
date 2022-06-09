package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> listaVoos;

    public GerenciadorVoos(){
        listaVoos = new ArrayList<>();
    }

    public void adicionar(Voo voo){
        listaVoos.add(voo);
    }

    public Voo listarTodos(){
        System.out.println("Lista de Voos: ");
        System.out.println("---------------");
        for(Voo v: listaVoos){
            System.out.println(v);
        }
        return null;
    }

    public ArrayList<Voo> buscarPorData(LocalDateTime data){
        System.out.println("Busca por data: " + data);
        System.out.println("------------------------");
        for (Voo v: listaVoos){
            if(v.getDatahora() == data){
                System.out.println(v.toString());
            }
        }
        return null;
    }
        
}
