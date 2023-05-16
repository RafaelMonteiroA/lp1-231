package semana12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestePessoa {
    
    @Test
    public void calcularIMC(){
        Pessoa p1 = new Pessoa(57.8, 1.7);

        double IMC = p1.calcularIMC();

        assertEquals(IMC, 20);
    }

    @Test
    public void precisaPerderPeso(){
        Pessoa p1 = new Pessoa(78.0, 1.7);

        double perderPeso = p1.peso - p1.pesoNormal2();

        assertEquals(perderPeso, 6.039, 0.001);
    }

    @Test
    public void precisaGanharPeso(){
        Pessoa p1 = new Pessoa(50.0, 1.7);

        double ganharPeso = p1.pesoNormal1() - p1.peso;

        assertEquals(ganharPeso, 3.464,0.001);
    }

    @Test
    public void pesoNormal(){
        Pessoa p1 = new Pessoa(57.8, 1.7);

        double IMC = p1.calcularIMC();

        assertEquals(IMC, 20);
    }
}
