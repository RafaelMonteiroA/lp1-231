package semana14;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class QuadradoTest {
    
    @Test
    public void testaInstanciarQuadrado() {
        Quadrado quadrado = new Quadrado(5.0);

        assertEquals(5.0, quadrado.getLado());
    }

    @Test
    public void testaCalcularArea() {
        Quadrado quadrado = new Quadrado(5.0);
        
        double area = quadrado.calcularArea();

        assertEquals(25.0, area);
    }

    @Test
    public void testaCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(5.0);
        
        double perimetro = quadrado.calcularPerimetro();

        assertEquals(20.0, perimetro);
    }

    @Test
    public void testaGetLado() {
        Quadrado quadrado = new Quadrado(5.0);
        
        double lado = quadrado.getLado();

        assertEquals(5.0, lado);
    }

    @Test
    public void testaSetLadoComLadoPositivo() {

        Quadrado quadrado = new Quadrado(5.0);

        quadrado.setLado(10.0);

        assertEquals(10.0, quadrado.getLado());
    }

    @Test
    public void testaSetLadoComLadoNegativo() {

        Quadrado quadrado = new Quadrado(5.0);

        assertThrows(RuntimeException.class, () -> {
            quadrado.setLado(-10.0);
        });
    }

    @Test
    public void testaSetLadoComLadoZero() {

        Quadrado quadrado = new Quadrado(5.0);

        assertThrows(RuntimeException.class, () -> {
            quadrado.setLado(0.0);
        });
    }
}