package semana12;

public class Aquario {
    public double altura;
    public double comprimento;
    public double largura;
    
    public Aquario(double altura, double comprimento, double largura){
        if (altura <= 0 || comprimento <= 0 || largura <= 0)
        throw new IllegalArgumentException("Nenhum valor pode ser menor ou igual a 0");
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularVolume(){
        return (altura * largura * comprimento)/100;
    }


    public Aquario(double valor){
        this(valor, valor, valor);
    }

    public double calcularPotenciaDoTermostato(double tempDesejada, double tempAmbiente){
        return calcularVolume() * 0.05 * (tempDesejada - tempAmbiente);
    }

    public double calcularQuantidadeLitrosFiltro(){
        return calcularVolume() * 3;
    }
}
