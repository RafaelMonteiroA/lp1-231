package semana11;

public class Pessoa {
    public double Peso;
    public double Altura;

    public double calcularIMC(){
        return Peso / (Altura*Altura);
    }

    public double pesoNormal1(){
        return 18.5 * (Altura*Altura);
    }

    public double pesoNormal2(){
        return 24.9 * (Altura*Altura);
    }

    public double ganharPeso(){
        return pesoNormal1() - Peso;
    }

    public double perderPeso(){
        return Peso - pesoNormal2()
    }
}
