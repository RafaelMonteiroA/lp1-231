package semana14;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class CirculoTest {
    
    @Test
    public void testaInstanciarCirculo() {
        Circulo circulo = new Circulo(2.0);

        assertEquals(2.0, circulo.getRaio());
    }

    @Test
    public void testaCalcularArea() {
        Circulo circulo = new Circulo(2.0);
        
        double area = circulo.calcularArea();

        assertEquals(12.56, area, 0.01);
    }

    @Test
    public void testaCalcularCircunferencia() {
        Circulo circulo = new Circulo(2.0);
        
        double circunferencia = circulo.calcularCircunferencia();

        assertEquals(12.56, circunferencia, 0.01);
    }

    @Test
    public void testaGetRaio() {
        Circulo circulo = new Circulo(2.0);
        
        double raio = circulo.getRaio();

        assertEquals(2.0, raio);
    }

    @Test
    public void testaSetRaioComRaioPositivo() {

        Circulo circulo = new Circulo(2.0);

        circulo.setRaio(3.0);

        assertEquals(3.0, circulo.getRaio());
    }

    @Test
    public void testaSetRaioComRaioNegativo() {

        Circulo circulo = new Circulo(2.0);

        assertThrows(RuntimeException.class, () -> {
            circulo.setRaio(-3.0);
        });
    }

    @Test
    public void testaSetRaioComRaioZero() {

        Circulo circulo = new Circulo(2.0);

        assertThrows(RuntimeException.class, () -> {
            circulo.setRaio(0.0);
        });
    }
}
