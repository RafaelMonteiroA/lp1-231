package semana10;

public class Programa {
    public static void main(String[] args) {
        // calcular a area e perimetro de um retangulo
        // area = base * altura
        // perimetro = 2 * (base + altura)

        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;

        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);

        double baseRet2 = 30.0;
        double alturaRet2 = 10.0;

        double areaRet2 = calcularArea(baseRet2, alturaRet2);
        double perimetroRet2 = calcularPerimetro(baseRet2, alturaRet2);
        
        // Tipo nomevariavel = valor
        String palavra = "abc";

        //Objeto (instância) da classe Retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 10.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        Quadrado qua1 = new Quadrado();
        qua1.lado = 10.0;

        Quadrado qua2 = new Quadrado();
        qua2.lado = 3.0;

        System.out.println(qua1.calcularArea());
        System.out.println(qua1.calcularPerimetro());

        System.out.println(qua2.calcularArea());
        System.out.println(qua2.calcularPerimetro());

        Circulo cir1 = new Circulo();
        cir1.raio = 12.0;

        Circulo cir2 = new Circulo();
        cir2.raio = 3.0;

        System.out.println(cir1.calcularArea());
        System.out.println(cir1.calcularPerimetro());

        System.out.println(cir2.calcularArea());
        System.out.println(cir2.calcularPerimetro());

    }

    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura){
        return 2 * (base + altura);
    }
}
