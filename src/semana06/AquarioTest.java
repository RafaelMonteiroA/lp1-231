package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AquarioTest {
    
    @Test
    public void calcularVolume(){
       
        double Comprimento = 10.0;
        double Altura = 20.0;
        double Largura = 10.0;

        double Volume = (Comprimento*Altura*Largura)/1000;

        assertEquals(Volume, 2);
    }

    @Test
    public void calcularTermostato(){
       
        double Volume = 2.0;
        double tempDesejada = 20;
        double tempAmbiente = 21;

        double Termostato = Volume * 0.05 * (tempDesejada - tempAmbiente);

        assertEquals(Termostato, -0.1);
    }

    @Test
    public void calcularFiltragem(){
       
        double Volume = 2.0;

        double Filtragem = Volume * 3;

        assertEquals(Filtragem, 6);
    }
}
