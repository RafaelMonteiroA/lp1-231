package semana19;

import java.time.LocalDate;


public abstract class Conta{

    private int numero;
    private LocalDate dataAbertura;
    private double saldo;
    private double tarifa;
    private Correntista correntista;

    public abstract double calcularTarifa();

    public Conta(int numero, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.tarifa = tarifa;
        this.correntista = correntista;
        this.dataAbertura = LocalDate.now();
        this.saldo = 0;
        correntista.addConta(this);
    }

    public void sacar(double valor) {
        if (valor <= saldo){
            this.saldo -= valor;
        }
    }
}