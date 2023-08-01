package semana14;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class RetanguloTest {
    
    @Test
    public void testaInstanciarRetanguloComDoisParametros() {
        Retangulo retangulo = new Retangulo(5.0, 10.0);

        assertEquals(5.0, retangulo.getBase());
        assertEquals(10.0, retangulo.getAltura());
    }

    @Test
    public void testaInstanciarRetanguloComUmParametro() {
        Retangulo retangulo = new Retangulo(5.0);

        assertEquals(5.0, retangulo.getBase());
        assertEquals(5.0, retangulo.getAltura());
    }

    @Test
    public void testaCalcularArea() {
        Retangulo retangulo = new Retangulo(5.0, 10.0);
        
        double area = retangulo.calcularArea();

        assertEquals(50.0, area);
    }

    @Test
    public void testaCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(5.0, 10.0);
        
        double perimetro = retangulo.calcularPerimetro();

        assertEquals(30.0, perimetro);
    }

    @Test
    public void testaGetBase() {
        Retangulo retangulo = new Retangulo(5.0, 10.0);
        
        double base = retangulo.getBase();

        assertEquals(5.0, base);
    }

    @Test
    public void testaGetAltura() {
        Retangulo retangulo = new Retangulo(5.0, 10.0);
        
        double altura = retangulo.getAltura();

        assertEquals(10.0, altura);
    }

    @Test
    public void testaSetBaseComBasePositiva() {

        Retangulo retangulo = new Retangulo(5.0, 10.0);

        retangulo.setBase(10.0);

        assertEquals(10.0, retangulo.getBase());
    }

    @Test
    public void testaSetBaseComBaseNegativa() {

        Retangulo retangulo = new Retangulo(5.0, 10.0);

        assertThrows(RuntimeException.class, () -> {
            retangulo.setBase(-10.0);
        });
    }

    @Test
    public void testaSetBaseComBaseZero() {

        Retangulo retangulo = new Retangulo(5.0, 10.0);

        assertThrows(RuntimeException.class, () -> {
            retangulo.setBase(0.0);
        });
    }

    @Test
    public void testaSetAlturaComAlturaPositiva() {

        Retangulo retangulo = new Retangulo(5.0, 10.0);

        retangulo.setAltura(5.0);

        assertEquals(5.0, retangulo.getAltura());
    }

    @Test
    public void testaSetAlturaComAlturaNegativa() {

        Retangulo retangulo = new Retangulo(5.0, 10.0);

        assertThrows(RuntimeException.class, () -> {
            retangulo.setAltura(-5.0);
        });
    }

    @Test
    public void testaSetAlturaComAlturaZero() {

        Retangulo retangulo = new Retangulo(5.0, 10.0);

        assertThrows(RuntimeException.class, () -> {
            retangulo.setAltura(0.0);
        });
    }
}