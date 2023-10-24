package semana12;

public class Conta {
    public double codigo;
    public double saldo;
    public String correntista;

    public Conta(double codigo, double saldo, String correntista){
        this.codigo = codigo;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public double sacar(double valor){
        if (valor > saldo || valor <= 0.0)
         throw new IllegalArgumentException("Valor inválido");
        return saldo - valor;
    }

    public double depositar(double valor){
        if (valor <= 0)
         throw new IllegalArgumentException("O valor à depositar deve ser maior que 0");
        return saldo + valor;
    }

    public double transferir(double valor, Conta conta){
        if (valor > saldo || valor <= 0.0)
         throw new IllegalArgumentException("Valor inválido");
        this.saldo -= valor;
        return conta.saldo + valor;
    }
}
