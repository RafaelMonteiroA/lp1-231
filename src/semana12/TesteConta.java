package semana12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TesteConta {
    
    @Test
    public void sacar(){
        Conta c1 = new Conta(1, 30, "Alex");

        double saldoAtual = c1.sacar(20);

        assertEquals(saldoAtual, 10);
    }

    @Test
    public void depositar(){
        Conta c1 = new Conta(1, 30, "Alex");

        double saldoAtual = c1.depositar(20);

        assertEquals(saldoAtual, 50);
    }

    @Test
    public void transferir(){
        Conta c1 = new Conta(1, 30, "Alex");
        Conta conta = new Conta(2, 50, "BetaTester");

        double saldoAtual = c1.transferir(20.0, conta);

        assertEquals(saldoAtual, 70);
        assertEquals(c1.saldo, 10);
    }
}
