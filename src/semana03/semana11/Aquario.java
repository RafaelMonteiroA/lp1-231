package semana11;

public class Aquario {
    public double altura;
    public double comprimento;
    public double largura;

    public double calcularVolume(){
        return (altura * largura * comprimento)/100;
    }

    public double calcularPotenciaDoTermostato(double tempDesejada, double tempAmbiente){
        return calcularVolume() * 0.05 * (tempDesejada - tempAmbiente);
    }

    public double calcularQuantidadeLitrosFiltro(){
        return calcularVolume() * 3;
    }
}
