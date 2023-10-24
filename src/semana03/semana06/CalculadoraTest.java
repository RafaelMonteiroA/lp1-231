package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    
    @Test
    public void somaDoisNumerosPositivos() {

        
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double soma = numero1 + numero2;

        // Assert
        assertEquals(12.0, soma);

    }

    @Test
    public void somaUmNumeroPositivoEUmNegativo() {
        double numero1 = 10.0;
        double numero2 = -2.0;

        double soma = Calculadora.soma(numero1, numero2);

        assertEquals(8.0, soma);

    }

    @Test
    public void somaDoisNumerosNegativos() {
        double numero1 = -10.0;
        double numero2 = -2.0;
    
        double soma = Calculadora.soma(numero1, numero2);
    
        assertEquals(-12.0, soma);

    }

    @Test
    public void subtraiDoisNumerosPositivos() {

        
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double subtrai = Calculadora.subtrair(numero1, numero2);

        // Assert
        assertEquals(8.0, subtrai);

    }

    @Test
    public void subtraiUmNumeroPositivoEUmNegativo() {
        double numero1 = 10.0;
        double numero2 = -2.0;

        double subtrai = Calculadora.subtrair(numero1, numero2);

        assertEquals(12.0, subtrai);

    }

    @Test
    public void subtraiDoisNumerosNegativos() {
        double numero1 = -10.0;
        double numero2 = -2.0;
    
        double subtrai = Calculadora.subtrair(numero1, numero2);
    
        assertEquals(-8.0, subtrai);
    }

    @Test
    public void multiplicaDoisNumerosPositivos() {

        
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double multiplica = Calculadora.multiplicar(numero1, numero2);

        // Assert
        assertEquals(20.0, multiplica);

    }

    @Test
    public void multiplicaUmNumeroPositivoEUmNegativo() {
        double numero1 = 10.0;
        double numero2 = -2.0;

        double multiplica = Calculadora.multiplicar(numero1, numero2);

        assertEquals(-20, multiplica);

    }

    @Test
    public void multiplicaDoisNumerosNegativos() {
        double numero1 = -10.0;
        double numero2 = -2.0;
    
        double multiplica = Calculadora.multiplicar(numero1, numero2);
    
        assertEquals(20.0, multiplica);

    }

    @Test
    public void divideDoisNumerosPositivos() {

        
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double divide = Calculadora.dividir(numero1, numero2);

        // Assert
        assertEquals(5.0, divide);

    }

    @Test
    public void divideUmNumeroPositivoEUmNegativo() {
        double numero1 = 10.0;
        double numero2 = -2.0;

        double divide = Calculadora.dividir(numero1, numero2);

        assertEquals(-5, divide);

    }

    @Test
    public void divideDoisNumerosNegativos() {
        double numero1 = -10.0;
        double numero2 = -2.0;
    
        double divide = Calculadora.dividir(numero1, numero2);
    
        assertEquals(5, divide);

    }
}
