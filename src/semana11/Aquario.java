package semana11;

public class Aquario {
    public double Altura;
    public double Comprimento;
    public double Largura;

    public double calcularVolume(){
        return (Comprimento * Altura * Largura)/100;
    }

    public double calcularPotenciaDoTermostato(double tempDesejada, double tempAmbiente){
        return calcularVolume() * 0.05 * (tempDesejada - tempAmbiente);
    }

    public double calcularQuantidadeLitrosFiltro(){
        return calcularVolume() * 3;
    }
}
