package semana10;

public class Quadrado {
    public double lado;

    public double calcularArea(){
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro(){
        return lado * 4;
    }

}

