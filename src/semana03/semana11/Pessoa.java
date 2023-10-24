package semana11;

public class Pessoa {
    public double peso;
    public double altura;

    public double calcularIMC(){
        return peso / (altura*altura);
    }

    public double pesoNormal1(){
        return 18.5 * (altura*altura);
    }

    public double pesoNormal2(){
        return 24.9 * (altura*altura);
    }

    public double ganharPeso(){
        return pesoNormal1() - peso;
    }

    public double perderPeso(){
        return peso - pesoNormal2();
    }
}
