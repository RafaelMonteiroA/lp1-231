import java.time.LocalDate;

public class Conta{

    private int numero;
    private LocalDate dataAbertura;
    private double saldo;
    private double tarifa;
    private Correntista correntista;

    public double calcularTarifa();

    public void sacar(double valor) {
        if (valor <= saldo){
            this.saldo -= valor;
        }
    }
}