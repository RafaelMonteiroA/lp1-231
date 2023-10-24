package semana12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TesteAquario {
    
    @Test
    public void calcularVolume(){
        Aquario a1 = new Aquario(30, 40, 50);
    
        double volume = a1.calcularVolume();

        assertEquals(volume, 600);
    }

    @Test
    public void calcularPotenciaDoTermostato(){
        Aquario a1 = new Aquario(30, 40, 50);

        double termostato = a1.calcularPotenciaDoTermostato(21, 20);

        assertEquals(termostato, 30);
    }

    @Test
    public void calcularQuantidadeLitrosFiltro(){
        Aquario a1 = new Aquario(30, 40, 50);

        double filtragem = a1.calcularQuantidadeLitrosFiltro();

        assertEquals(filtragem, 1800);
    }
}
