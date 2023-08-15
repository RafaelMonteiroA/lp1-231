package semana19;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Correntista cor1 = new Correntista(1, "João Silva");
        Empresa em1 = new Empresa("111.111.111.1", "Empresa ...");

        ContaCorrente cc1 = new ContaCorrente(1, 20.00, 2000.00, cor1);
        ContaPoupanca cp1 = new ContaPoupanca(2, 20.00, LocalDate.now(), cor1);
        ContaSalario cs1 = new ContaSalario(3, 0, em1, cor1);

        System.out.println(cor1.calcularTarifa());
    }
}
