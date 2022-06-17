package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> listaAeroportos;

    public GerenciadorAeroportos(){
        listaAeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aeroporto){
        listaAeroportos.add(aeroporto);
    }

    public Aeroporto listarTodos(){
        System.out.println("Lista de aeroportos: ");
        System.out.println("---------------------");
        for(Aeroporto aero: listaAeroportos){
            System.out.println(aero.toString());
        }
        return null;
    }

    public Aeroporto buscarPorCodigo(String cod){
        System.out.println("Busca por código: " + cod);
        System.out.println("------------------------");
        for (Aeroporto aero: listaAeroportos){
            if(aero.getCodigo() == cod){
                System.out.println(aero.getNome() + " | Latitude: " + aero.getLocal().getLatitude() + " Longitude: " + aero.getLocal().getLongitude());
            }
        }
        return null;
    }
    
    public void ordenaAeroportosNome(){
        Collections.sort(listaAeroportos);
        for(Aeroporto aero: listaAeroportos){
            System.out.println(aero.toString());
        }
    }

}