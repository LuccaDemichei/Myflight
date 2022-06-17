/*
 *  Classe que utiliza o conceito de heranca
 *  Criado por Lucca Demichei - dia 11/06
*/
package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.Duration;

public class VooVariasEscalas extends VooEscalas implements Contavel{
    private Rota primeiraEscala;
    private Rota segundaEscala;
    private int nroEscalas;

    public VooVariasEscalas(Rota rota, Rota primeiraEscala, Rota rotaFinal, LocalDateTime datahora, Duration duracao){
        super(rota, rotaFinal, datahora, duracao);
        this.primeiraEscala = primeiraEscala;
        this.nroEscalas = 2;   
    }

    public VooVariasEscalas(Rota rota, Rota primeiraEscala, Rota segundaEscala ,Rota rotaFinal, LocalDateTime datahora, Duration duracao){
        super(rota, rotaFinal, datahora, duracao);
        this.primeiraEscala = primeiraEscala;
        this.segundaEscala = segundaEscala;
        this.nroEscalas = 3;   
    }

    public Rota primeiraEscala(){
        return primeiraEscala;
    }
    
    public Rota segundaEscala(){
        return segundaEscala;
    }

    public int qntdObjetos(){
        return nroEscalas;
    }

    @Override
    public String toString(){
        if (segundaEscala !=null){
            return super.toString() + "\n" + "Quantidade de escalas: " + nroEscalas
            + "\n" + "Primeira escala: " + primeiraEscala + "\n" + "Segunda escala: " + segundaEscala;
        } else
        return super.toString() + "\n" + "Quantidade de escalas: " + nroEscalas
                + "\n" + "Primeira escala: " + primeiraEscala + "\n";
    }
}