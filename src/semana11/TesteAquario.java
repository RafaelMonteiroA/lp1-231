package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TesteAquario {
    
    @Test
    public void calcularVolume(){
        Aquario A1 = new Aquario();
        A1.Altura = 30;
        A1.Largura = 40;
        A1.Comprimento = 50;

        double Volume = A1.calcularVolume();

        assertEquals(Volume, 600);
    }

    @Test
    public void calcularPotenciaDoTermostato(){
        Aquario A1 = new Aquario();
        A1.Altura = 30;
        A1.Largura = 40;
        A1.Comprimento = 50;

        double Termostato = A1.calcularPotenciaDoTermostato(21, 20);

        assertEquals(Termostato, 30);
    }

    @Test
    public void calcularQuantidadeLitrosFiltro(){
        Aquario A1 = new Aquario();
        A1.Altura = 30;
        A1.Largura = 40;
        A1.Comprimento = 50;

        double Filtragem = A1.calcularQuantidadeLitrosFiltro();

        assertEquals(Filtragem, 1800);
    }
}
