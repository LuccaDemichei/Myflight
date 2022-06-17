//feito por gabriela sussuarana no dia 07/05
package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.Duration;

public class VooEscalas extends Voo
{
    private Rota rotaFinal;

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
       super(rota, datahora, duracao);
       this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal() { 
        return rotaFinal; 
    }

    @Override
    public String toString() {
        return super.toString() + " -> Destino final: " + rotaFinal;
    }

}
