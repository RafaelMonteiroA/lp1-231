/**
 package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AquarioTest {

    @Test
    public static void AquarioPositivo() {
        double Comprimento = 100;
        double Altura = 50;
        double Largura = 50;
        double TempDesejada = 30;
        double TempAmbiente = 20;

        double Volume = (Comprimento*Altura*Largura)/1000;
        double PotenciaTermostrato = Volume * 0.05 * (TempDesejada - TempAmbiente);
        double Filtragem = Volume*3;

        assertEquals(250, Volume);
        assertEquals(125, PotenciaTermostrato);
        assertEquals(750, Filtragem);
    }
}
*/