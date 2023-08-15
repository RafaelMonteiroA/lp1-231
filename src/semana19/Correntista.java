package semana19;

import java.util.List;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> contas;

    public Correntista(int i, String string) {
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public double calcularTarifa() {
        double totalTarifas = 0;
        for (Conta conta : contas) {
            totalTarifas += conta.calcularTarifa();
        }
        return totalTarifas;
    }
}
