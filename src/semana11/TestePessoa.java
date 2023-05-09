package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestePessoa {
    
    @Test
    public void calcularIMC(){
        Pessoa p1 = new Pessoa();
        p1.Peso = 57.8;
        p1.Altura = 1.7;

        double IMC = p1.calcularIMC();

        assertEquals(IMC, 20);
    }

    @Test
    public void precisaPerderPeso(){
        Pessoa p1 = new Pessoa();
        p1.Peso = 78.0;
        p1.Altura = 1.7;

        double perderPeso = p1.Peso - p1.pesoNormal2();

        assertEquals(perderPeso, 6.039000000000016);
    }

    @Test
    public void precisaGanharPeso(){
        Pessoa p1 = new Pessoa();
        p1.Peso = 50.0;
        p1.Altura = 1.7;

        double ganharPeso = p1.pesoNormal1() - p1.Peso;

        assertEquals(ganharPeso, 3.4649999999999963);
    }

    @Test
    public void pesoNormal(){
        Pessoa p1 = new Pessoa();
        p1.Peso = 57.8;
        p1.Altura = 1.7;

        double IMC = p1.calcularIMC();

        assertEquals(IMC, 20);
    }
}
